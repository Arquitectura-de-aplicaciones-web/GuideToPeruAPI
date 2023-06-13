package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Cliente;
import pe.edu.upc.guidetoperu.entities.Producto;

import java.time.LocalDate;

public class CompraDTO {
    private int idCompra;
    private int cantidadCompra;
    private float precioCompra;
    private String descripcionCompra;
    private LocalDate fechaCompra;
    private Cliente clienteCompra;
    private Producto productoCompra;

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

    public void setDescripcionCompra(String descripcionCompra) { this.descripcionCompra = descripcionCompra; }

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

    public Producto getProductoCompra() { return productoCompra; }

    public void setProductoCompra(Producto productoCompra) { this.productoCompra = productoCompra; }
}
