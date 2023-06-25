package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.dtos.ComentariodecadaProductoDTO;
import pe.edu.upc.guidetoperu.dtos.ProductocalificadosDTO;
import pe.edu.upc.guidetoperu.entities.Producto;
import pe.edu.upc.guidetoperu.repositories.IProductoRepository;
import pe.edu.upc.guidetoperu.services.IProductoService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImplement implements IProductoService {
    @Autowired
    private IProductoRepository pR;

    @Override
    public void insert(Producto producto) { pR.save(producto); }

    @Override
    public List<Producto> list() { return pR.findAll(); }

    @Override
    public void delete(int idproducto) { pR.deleteById(idproducto); }

    @Override
    public Producto listId(int idproducto) { return pR.findById(idproducto).orElse(new Producto()); }

    @Override
    public List<ComentariodecadaProductoDTO> reporte3() {

        List<String[]> ProductosConComentarios = pR.getProductosConComentarios();
        List<ComentariodecadaProductoDTO> ComentariodecadaProductoDTOs = new ArrayList<>();

        for (String[] data : ProductosConComentarios) {
            ComentariodecadaProductoDTO dto = new ComentariodecadaProductoDTO();
            dto.setNombre(data[0]);
            dto.setComentario(data[1]);
            ComentariodecadaProductoDTOs.add(dto);
        }

        return ComentariodecadaProductoDTOs;
    }

    @Override
    public List<ProductocalificadosDTO> reporte4() {

        List<String[]> productoscalificado = pR.findProductosMejorCalificados();
        List<ProductocalificadosDTO>  mascalificados = new ArrayList<>();

        for (String[] data : productoscalificado) {
            ProductocalificadosDTO dto = new ProductocalificadosDTO();
            dto.setNameProducto(data[0]);
            mascalificados.add(dto);
        }

        return mascalificados;
    }




}
