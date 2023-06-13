package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.ComentarioProducto;

import java.util.List;
public interface IComentarioProductoService {
    public void insert(ComentarioProducto comentarioProducto);
    List<ComentarioProducto> list();
    public List<ComentarioProducto> listByCliente(int idCliente);
    public List<ComentarioProducto> listByProducto(int idProducto);
    public List<ComentarioProducto> listByClienteProducto(int idCliente, int idProducto);
    public void delete(int idComentarioProducto);
    public void deleteByCliente(int idCliente);
    public void deleteByProducto(int idProducto);
    public void deleteByClienteProducto(int idCliente, int idProducto);
}
