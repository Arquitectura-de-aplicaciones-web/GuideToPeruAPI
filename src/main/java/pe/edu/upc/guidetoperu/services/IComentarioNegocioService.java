package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.ComentarioNegocio;

import java.util.List;

public interface IComentarioNegocioService {
    public void insert(ComentarioNegocio comentarioNegocio);
    List<ComentarioNegocio> list();
    public List<ComentarioNegocio> listByCliente(int idCliente);
    public List<ComentarioNegocio> listByNegocio(int idNegocio);
    public List<ComentarioNegocio> listByClienteNegocio(int idCliente, int idNegocio);
    public void delete(int idComentarioNegocio);
    public void deleteByCliente(int idCliente);
    public void deleteByNegocio(int idNegocio);
    public void deleteByClienteNegocio(int idCliente, int idNegocio);
}
