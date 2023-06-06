package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name = "nameCliente",length = 20,nullable=false)
    private String nameCliente;
    @Column(name = "apellidoCliente",length = 20,nullable=false)
    private String apellidoCliente;
    @Column(name = "anioNacimiento")
    private LocalDate anioNacimiento;
    @Column(name = "cuentaBancaria",length = 20,nullable=false)
    private int cuentaBancaria;
    @Column(name = "direccion",length = 20,nullable=true)
    private String direccion;
    @Column(name = "IDUsuario",length = 20,nullable=false)
    private int IDUsuario;

    public Cliente() {
    }

    public Cliente(int idCliente, String nameCliente, String apellidoCliente, LocalDate anioNacimiento, int cuentaBancaria, String direccion, int IDUsuario) {
        this.idCliente = idCliente;
        this.nameCliente = nameCliente;
        this.apellidoCliente = apellidoCliente;
        this.anioNacimiento = anioNacimiento;
        this.cuentaBancaria = cuentaBancaria;
        this.direccion = direccion;
        this.IDUsuario = IDUsuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }
}
