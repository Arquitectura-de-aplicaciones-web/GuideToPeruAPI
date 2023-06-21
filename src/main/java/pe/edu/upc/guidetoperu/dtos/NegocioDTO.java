package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Users;

import javax.persistence.Column;

public class NegocioDTO {
    private int id;
    private String nameNegocio;
    private String direccionNegocio;
    private String TipoNegocio;
    private Users IDusuario;
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

    public String getTipoNegocio() {
        return TipoNegocio;
    }

    public void setTipoNegocio(String TipoNegocio) {
        this.TipoNegocio = TipoNegocio;
    }

    public Users getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(Users IDusuario) {
        this.IDusuario = IDusuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
