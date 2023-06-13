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
    public List<ComentarioProducto> listByCliente(int idCliente) {
        return cpR.listByCliente(idCliente);
    }

    @Override
    public List<ComentarioProducto> listByProducto(int idProducto) {
        return cpR.listByProducto(idProducto);
    }

    @Override
    public List<ComentarioProducto> listByClienteProducto(int idCliente, int idProducto) {
        return cpR.listByClienteProducto(idCliente, idProducto);
    }

    @Override
    public void delete(int idComentarioProducto) {
        cpR.deleteById(idComentarioProducto);
    }

    @Override
    public void deleteByCliente(int idCliente) {
        cpR.deleteByCliente(idCliente);
    }

    @Override
    public void deleteByProducto(int idProducto) {
        cpR.deleteByProducto(idProducto);
    }

    @Override
    public void deleteByClienteProducto(int idCliente, int idProducto) {
        cpR.deleteByClienteProducto(idCliente, idProducto);
    }
}
