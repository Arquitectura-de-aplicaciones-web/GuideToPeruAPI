package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;
    @Column(name = "cantidadCompra", nullable = false)
    private int cantidadCompra;
    @Column(name = "precioCompra", nullable = false)
    private float precioCompra;
    @Column(name = "descripcionCompra", length = 50)
    private String descripcionCompra;
    @Column(name = "fechaCompra", nullable = false)
    private LocalDate fechaCompra;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente clienteCompra;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto productoCompra;

    public Compra() {
    }

    public Compra(int idCompra, int cantidadCompra, float precioCompra, String descripcionCompra, LocalDate fechaCompra, Cliente clienteCompra, Producto productoCompra) {
        this.idCompra = idCompra;
        this.cantidadCompra = cantidadCompra;
        this.precioCompra = precioCompra;
        this.descripcionCompra = descripcionCompra;
        this.fechaCompra = fechaCompra;
        this.clienteCompra = clienteCompra;
        this.productoCompra = productoCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Cliente getClienteCompra() {
        return clienteCompra;
    }

    public void setClienteCompra(Cliente clienteCompra) {
        this.clienteCompra = clienteCompra;
    }

    public Producto getProductoCompra() {
        return productoCompra;
    }

    public void setProductoCompra(Producto productoCompra) {
        this.productoCompra = productoCompra;
    }
}
