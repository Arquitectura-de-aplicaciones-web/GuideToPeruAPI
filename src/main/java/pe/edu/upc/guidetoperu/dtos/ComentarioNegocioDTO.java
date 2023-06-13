package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Cliente;
import pe.edu.upc.guidetoperu.entities.Negocio;

public class ComentarioNegocioDTO {
    private int idComentarioNegocio;
    private String comentario;
    private int calificacion;
    private Negocio negocio;
    private Cliente cliente;

    public int getIdComentarioNegocio() {
        return idComentarioNegocio;
    }

    public void setIdComentarioNegocio(int idComentarioNegocio) {
        this.idComentarioNegocio = idComentarioNegocio;
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

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
