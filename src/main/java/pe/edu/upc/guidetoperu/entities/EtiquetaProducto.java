package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "etiqueta_productos")
public class EtiquetaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtiquetaProducto;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "idEtiqueta")
    private Etiqueta etiqueta;

    public EtiquetaProducto() {
    }

    public EtiquetaProducto(int idEtiquetaProducto, Producto producto, Etiqueta etiqueta) {
        this.idEtiquetaProducto = idEtiquetaProducto;
        this.producto = producto;
        this.etiqueta = etiqueta;
    }

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
