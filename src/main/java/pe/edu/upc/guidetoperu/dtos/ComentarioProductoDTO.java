package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Cliente;
import pe.edu.upc.guidetoperu.entities.Producto;

public class ComentarioProductoDTO {
    private int idComentarioProducto;
    private String comentario;
    private int calificacion;
    private Producto producto;
    private Cliente cliente;

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
