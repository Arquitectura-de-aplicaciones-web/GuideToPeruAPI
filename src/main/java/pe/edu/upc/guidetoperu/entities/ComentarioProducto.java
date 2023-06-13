package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "comentario_productos")
public class ComentarioProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentarioProducto;
    @Column(name = "comentario", length = 100)
    private String comentario;
    @Column(name = "calificacion", nullable = false)
    private int calificacion;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    public ComentarioProducto() {
    }

    public ComentarioProducto(int idComentarioProducto, String comentario, int calificacion, Producto producto, Cliente cliente) {
        this.idComentarioProducto = idComentarioProducto;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.producto = producto;
        this.cliente = cliente;
    }

    public int getIdComentarioProducto() {
        return idComentarioProducto;
    }

    public void setIdComentarioProducto(int idComentarioProducto) {
        this.idComentarioProducto = idComentarioProducto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
