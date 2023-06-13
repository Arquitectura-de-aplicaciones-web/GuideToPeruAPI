package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Etiqueta;
import pe.edu.upc.guidetoperu.entities.Producto;

public class EtiquetaProductoDTO {
    private int idEtiquetaProducto;
    private Producto producto;
    private Etiqueta etiqueta;

    public int getIdEtiquetaProducto() {
        return idEtiquetaProducto;
    }

    public void setIdEtiquetaProducto(int idEtiquetaProducto) {
        this.idEtiquetaProducto = idEtiquetaProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }
}
