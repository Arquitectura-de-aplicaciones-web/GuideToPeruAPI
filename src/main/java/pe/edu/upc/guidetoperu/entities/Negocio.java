package pe.edu.upc.guidetoperu.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="negocios")
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNegocio;
    @Column(name = "nameNegocio", length = 60, nullable = false)
    private String nameNegocio;
    @Column(name = "direccionNegocio", length = 40, nullable = false)
    private String direccionNegocio;
    @Column(name = "tipoNegocio", length = 40, nullable = false)
    private int tipoNegocio;
    @Column (name = "IDUsuario", length = 40, nullable = false)
    private int IDUsuario;
    @Column (name = "calificacion", length = 40, nullable = false)
    private int calificacion;

    public Negocio() {
    }

    public Negocio(int idNegocio, String nameNegocio, String direccionNegocio, int tipoNegocio, int IDUsuario, int calificacion) {
        this.idNegocio = idNegocio;
        this.nameNegocio = nameNegocio;
        this.direccionNegocio = direccionNegocio;
        this.tipoNegocio = tipoNegocio;
        this.IDUsuario = IDUsuario;
        this.calificacion = calificacion;
    }

    public int getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(int idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNameNegocio() {
        return nameNegocio;
    }

    public void setNameNegocio(String nameNegocio) {
        this.nameNegocio = nameNegocio;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public int getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(int tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUSsuario(int IDusuario) {
        this.IDUsuario = IDusuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
