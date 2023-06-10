package pe.edu.upc.guidetoperu.dtos;

import javax.persistence.Column;

public class NegocioDTO {
    private int idNegocio;
    private String nameNegocio;
    private String direccionNegocio;
    private int tipoNegocio;
    private int IDUsuario;
    private int calificacion;


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

    public void setIDUsuario(int IDusuario) {
        this.IDUsuario = IDusuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
