package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name="negocios")
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNegocio;
    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;
    @Column(name = "direccion", length = 40, nullable = false)
    private String direccion;
    @Column(name = "calificacion")
    private int calificacion;
    @ManyToOne
    @JoinColumn(name = "idTipoNegocio")
    private TipoNegocio tipoNegocio;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Negocio() {
    }

    public Negocio(int idNegocio, String nombre, String direccion, int calificacion, TipoNegocio tipoNegocio, Usuario usuario) {
        this.idNegocio = idNegocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.tipoNegocio = tipoNegocio;
        this.usuario = usuario;
    }

    public int getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(int idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public TipoNegocio getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(TipoNegocio tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
