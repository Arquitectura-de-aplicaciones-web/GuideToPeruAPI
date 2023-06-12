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
    private int id;
    @Column(name = "nameNegocio", length = 60, nullable = false)
    private String nameNegocio;
    @Column(name = "direccionNegocio", length = 40, nullable = false)
    private String direccionNegocio;
    @Column(name = "tipoNegocio", length = 40, nullable = false)
    private int tipoNegocio;
    @Column (name = "IDusuario", length = 40, nullable = false)
    private int IDusuario;
    @Column (name = "calificacion", length = 40, nullable = false)
    private int calificacion;

    public Negocio() {
    }

    public Negocio(int id, String nameNegocio, String direccionNegocio, int tipoNegocio, int IDusuario, int calificacion) {
        this.id = id;
        this.nameNegocio = nameNegocio;
        this.direccionNegocio = direccionNegocio;
        this.tipoNegocio = tipoNegocio;
        this.IDusuario = IDusuario;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
