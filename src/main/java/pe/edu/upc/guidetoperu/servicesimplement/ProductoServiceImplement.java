package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Producto;
import pe.edu.upc.guidetoperu.repositories.IProductoRepository;
import pe.edu.upc.guidetoperu.services.IProductoService;

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
}
