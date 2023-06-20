package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproducto;

    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private float precio;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "visible", nullable = false)
    private boolean visible;

    @Column(name = "calificacion", nullable = false)
    private int calificacion;

    @ManyToOne
    @JoinColumn(name = "idnegocio")
    private Negocio idnegocio;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, String descripcion, float precio, int cantidad, boolean visible, int calificacion, Negocio negocio) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.visible = visible;
        this.calificacion = calificacion;
        this.idnegocio = negocio;
    }

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
