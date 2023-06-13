package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.EtiquetaProducto;
import pe.edu.upc.guidetoperu.repositories.IEtiquetaProductoRepository;
import pe.edu.upc.guidetoperu.services.IEtiquetaProductoService;

import java.util.List;

@Service
public class EtiquetaProductoServiceImplement implements IEtiquetaProductoService {
    @Autowired
    private IEtiquetaProductoRepository epR;

    @Override
    public void insert(EtiquetaProducto comentarioProducto) {
        epR.save(comentarioProducto);
    }

    @Override
    public List<EtiquetaProducto> list() {
        return epR.findAll();
    }

    @Override
    public List<EtiquetaProducto> listByEtiqueta(int idEtiqueta) {
        return epR.listByEtiqueta(idEtiqueta);
    }

    @Override
    public List<EtiquetaProducto> listByProducto(int idProducto) {
        return epR.listByProducto(idProducto);
    }

    @Override
    public List<EtiquetaProducto> listByEtiquetaProducto(int idEtiqueta, int idProducto) {
        return epR.listByEtiquetaProducto(idEtiqueta, idProducto);
    }

    @Override
    public void delete(int idEtiquetaProducto) {
        epR.deleteById(idEtiquetaProducto);
    }

    @Override
    public void deleteByEtiqueta(int idEtiqueta) {
        epR.deleteByEtiqueta(idEtiqueta);
    }

    @Override
    public void deleteByProducto(int idProducto) {
        epR.deleteByProducto(idProducto);
    }

    @Override
    public void deleteByEtiquetaProducto(int idEtiqueta, int idProducto) {
        epR.deleteByEtiquetaProducto(idEtiqueta, idProducto);
    }
}
