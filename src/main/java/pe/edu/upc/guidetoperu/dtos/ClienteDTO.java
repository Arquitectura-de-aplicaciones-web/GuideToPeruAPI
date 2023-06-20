package pe.edu.upc.guidetoperu.dtos;
import pe.edu.upc.guidetoperu.entities.Users;

import java.time.LocalDate;

public class ClienteDTO {

    private int id;
    private String nameCliente;
    private String apellidoCliente;
    private LocalDate anioNacimiento;
    private int cuentaBancaria;
    private String direccion;
    private Users idusuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCliente() {
        return nameCliente;
    }

    public void setNameCliente(String nameCliente) {
        this.nameCliente = nameCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Users getIDUsuario() {
        return idusuario;
    }

    public void setIDUsuario(Users idusuario) {
        this.idusuario = idusuario;
    }
}
