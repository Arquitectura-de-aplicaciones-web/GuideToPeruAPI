package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Negocio;


public class ProductoDTO {
    private int idproducto;

    private String nombre;

    private String descripcion;

    private float precio;

    private int cantidad;

    private boolean visible;

    private int calificacion;

    private Negocio idnegocio;

    public int getIdProducto() {
        return idproducto;
    }

    public void setIdProducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Negocio getNegocio() {
        return idnegocio;
    }

    public void setNegocio(Negocio negocio) {
        this.idnegocio = negocio;
    }
}
