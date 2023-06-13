package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "comentario_negocios")
public class ComentarioNegocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentarioNegocio;
    @Column(name = "comentario", length = 100)
    private String comentario;
    @Column(name = "calificacion", nullable = false)
    private int calificacion;
    @ManyToOne
    @JoinColumn(name = "idNegocio")
    private Negocio negocio;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    public ComentarioNegocio() {
    }

    public ComentarioNegocio(int idComentarioNegocio, String comentario, int calificacion, Negocio negocio, Cliente cliente) {
        this.idComentarioNegocio = idComentarioNegocio;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.negocio = negocio;
        this.cliente = cliente;
    }

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
