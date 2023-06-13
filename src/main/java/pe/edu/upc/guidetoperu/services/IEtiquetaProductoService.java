package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.EtiquetaProducto;
import pe.edu.upc.guidetoperu.entities.EtiquetaProducto;

import java.util.List;

public interface IEtiquetaProductoService {
    public void insert(EtiquetaProducto comentarioProducto);
    List<EtiquetaProducto> list();
    public List<EtiquetaProducto> listByEtiqueta(int idEtiqueta);
    public List<EtiquetaProducto> listByProducto(int idProducto);
    public List<EtiquetaProducto> listByEtiquetaProducto(int idEtiqueta, int idProducto);
    public void delete(int idEtiquetaProducto);
    public void deleteByEtiqueta(int idEtiqueta);
    public void deleteByProducto(int idProducto);
    public void deleteByEtiquetaProducto(int idEtiqueta, int idProducto);
}
