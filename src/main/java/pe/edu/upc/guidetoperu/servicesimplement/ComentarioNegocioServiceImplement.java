package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.ComentarioNegocio;
import pe.edu.upc.guidetoperu.repositories.IComentarioNegocioRepository;
import pe.edu.upc.guidetoperu.services.IComentarioNegocioService;

import java.util.List;

@Service
public class ComentarioNegocioServiceImplement implements IComentarioNegocioService {
    @Autowired
    private IComentarioNegocioRepository cnR;

    @Override
    public void insert(ComentarioNegocio comentarioNegocio) {
        cnR.save(comentarioNegocio);
    }

    @Override
    public List<ComentarioNegocio> list() {
        return cnR.findAll();
    }

    @Override
    public List<ComentarioNegocio> listByCliente(int idCliente) {
        return cnR.listByCliente(idCliente);
    }

    @Override
    public List<ComentarioNegocio> listByNegocio(int idNegocio) {
        return cnR.listByNegocio(idNegocio);
    }

    @Override
    public List<ComentarioNegocio> listByClienteNegocio(int idCliente, int idNegocio) {
        return cnR.listByClienteNegocio(idCliente, idNegocio);
    }

    @Override
    public void delete(int idComentarioNegocio) {
        cnR.deleteById(idComentarioNegocio);
    }

    @Override
    public void deleteByCliente(int idCliente) {
        cnR.deleteByCliente(idCliente);
    }

    @Override
    public void deleteByNegocio(int idNegocio) {
        cnR.deleteByNegocio(idNegocio);
    }

    @Override
    public void deleteByClienteNegocio(int idCliente, int idNegocio) {
        cnR.deleteByClienteNegocio(idCliente, idNegocio);
    }
}
