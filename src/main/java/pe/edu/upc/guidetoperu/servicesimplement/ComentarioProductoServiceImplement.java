package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.ComentarioProducto;
import pe.edu.upc.guidetoperu.repositories.IComentarioProductoRepository;
import pe.edu.upc.guidetoperu.services.IComentarioProductoService;

import java.util.List;

@Service
public class ComentarioProductoServiceImplement implements IComentarioProductoService {
    @Autowired
    private IComentarioProductoRepository cpR;

    @Override
    public void insert(ComentarioProducto comentarioProducto) {
        cpR.save(comentarioProducto);
    }

    @Override
    public List<ComentarioProducto> list() {
        return cpR.findAll();
    }

    @Override
    public List<ComentarioProducto> listByCliente(int idcliente) {
        return cpR.listByCliente(idcliente);
    }

    @Override
    public List<ComentarioProducto> listByProducto(int idproducto) {
        return cpR.listByProducto(idproducto);
    }

    @Override
    public List<ComentarioProducto> listByClienteProducto(int idcliente, int idproducto) {
        return cpR.listByClienteProducto(idcliente, idproducto);
    }

    @Override
    public void delete(int idComentarioProducto) {
        cpR.deleteById(idComentarioProducto);
    }

    @Override
    public void deleteByCliente(int idcliente) {
        cpR.deleteByCliente(idcliente);
    }

    @Override
    public void deleteByProducto(int idproducto) {
        cpR.deleteByProducto(idproducto);
    }

    @Override
    public void deleteByClienteProducto(int idcliente, int idproducto) {
        cpR.deleteByClienteProducto(idcliente, idproducto);
    }
}
