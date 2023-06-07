package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "contrasenia", length = 20, nullable = false)
    private String contrasenia;

    public Usuario() { }

    public Usuario(int idUser, String email, String contrasenia, String telefono) {
        this.idUser = idUser;
        this.email = email;
        this.contrasenia = contrasenia;
        this.telefono=telefono;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
