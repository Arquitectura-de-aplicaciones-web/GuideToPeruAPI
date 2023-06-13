package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Compra;
import pe.edu.upc.guidetoperu.repositories.ICompraRepository;
import pe.edu.upc.guidetoperu.services.ICompraService;

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
}
