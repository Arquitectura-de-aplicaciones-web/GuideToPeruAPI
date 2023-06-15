package pe.edu.upc.guidetoperu.dtos;

import javax.persistence.Column;

public class NegocioDTO {
    private int id;
    private String nameNegocio;
    private String direccionNegocio;
    private int TipoNegocio;
    private int IDusuario;
    private int calificacion;


    public int getId() {
        return id;
    }

    public void setIdNegocio(int id) {
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
        return TipoNegocio;
    }

    public void setTipoNegocio(int TipoNegocio) {
        this.TipoNegocio = TipoNegocio;
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
