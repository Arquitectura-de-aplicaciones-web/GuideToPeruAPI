package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Rol;

import javax.persistence.*;
import java.util.List;

public class UsuarioDTO {
    private int id;
    private String telefono;
    private String email;
    private String contrasenia;
    private String Username;
    private Boolean aux;
    private List<Rol> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Boolean getAux() {
        return aux;
    }

    public void setAux(Boolean aux) {
        this.aux = aux;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
