package pe.edu.upc.guidetoperu.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class DestinosDTO {

    private int idDestinos;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private String imagen;
    private String distrito;
    private String departarmento;

    public int getIdDestinos() {
        return idDestinos;
    }

    public void setIdDestinos(int idDestinos) {
        this.idDestinos = idDestinos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDepartarmento() {
        return departarmento;
    }

    public void setDepartarmento(String departarmento) {
        this.departarmento = departarmento;
    }
}
