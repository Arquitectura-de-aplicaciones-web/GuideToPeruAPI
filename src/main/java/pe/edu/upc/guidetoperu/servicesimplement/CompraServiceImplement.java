package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.dtos.ClienteCompraDTO;
import pe.edu.upc.guidetoperu.dtos.ProductoCompraDTO;
import pe.edu.upc.guidetoperu.entities.Compra;
import pe.edu.upc.guidetoperu.repositories.ICompraRepository;
import pe.edu.upc.guidetoperu.services.ICompraService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraServiceImplement implements ICompraService {
    @Autowired
    private ICompraRepository cR;

    @Override
    public void insert(Compra compra) { cR.save(compra); }

    @Override
    public List<Compra> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCompra) {
        cR.deleteById(idCompra);
    }

    @Override
    public Compra listId(int idCompra) {
        return cR.findById(idCompra).orElse(new Compra());
    }

    @Override
    public List<ProductoCompraDTO> reporte01() {

        List<String[]> productosmascomprados = cR.productosmascomprados();
        List<ProductoCompraDTO> productocompra = new ArrayList<>();

        for (String[] data : productosmascomprados) {
            ProductoCompraDTO dto = new ProductoCompraDTO();
            dto.setName(data[0]);
            dto.setCompraCount(Integer.parseInt(data[1]));
            productocompra.add(dto);
        }

        return productocompra;

    }

    @Override
    public List<ClienteCompraDTO> reporte02() {

        List<String[]> clientessmascompras = cR.clientescompras();
        List<ClienteCompraDTO> clientecompra = new ArrayList<>();

        for (String[] data : clientessmascompras) {
            ClienteCompraDTO dto = new ClienteCompraDTO();
            dto.setName(data[0]);
            dto.setCompraCount(Integer.parseInt(data[1]));
            clientecompra.add(dto);
        }

        return clientecompra;

    }





}
