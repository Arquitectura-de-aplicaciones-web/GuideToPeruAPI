package pe.edu.upc.guidetoperu.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class DestinosDTO {

    private int idDestinos;
    private String nameDestinos;
    private String ubicacionDestinos;
    private String descripcionDestinos;
    private String imagenDestinos;
    private String distritoDestinos;
    private String departarmentoDestinos;

    public int getIdDestinos() {
        return idDestinos;
    }

    public void setIdDestinos(int idDestinos) {
        this.idDestinos = idDestinos;
    }

    public String getNameDestinos() {
        return nameDestinos;
    }

    public void setNameDestinos(String nameDestinos) {
        this.nameDestinos = nameDestinos;
    }

    public String getUbicacionDestinos() {
        return ubicacionDestinos;
    }

    public void setUbicacionDestinos(String ubicacionDestinos) {
        this.ubicacionDestinos = ubicacionDestinos;
    }

    public String getDescripcionDestinos() {
        return descripcionDestinos;
    }

    public void setDescripcionDestinos(String descripcionDestinos) {
        this.descripcionDestinos = descripcionDestinos;
    }

    public String getImagenDestinos() {
        return imagenDestinos;
    }

    public void setImagenDestinos(String imagenDestinos) {
        this.imagenDestinos = imagenDestinos;
    }

    public String getDistritoDestinos() {
        return distritoDestinos;
    }

    public void setDistritoDestinos(String distritoDestinos) {
        this.distritoDestinos = distritoDestinos;
    }

    public String getDepartarmentoDestinos() {
        return departarmentoDestinos;
    }

    public void setDepartarmentoDestinos(String departarmentoDestinos) {
        this.departarmentoDestinos = departarmentoDestinos;
    }




}
