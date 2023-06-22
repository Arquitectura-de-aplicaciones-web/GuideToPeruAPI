package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Role;

import java.util.List;

public class UserDTO {
    private int id;
    private String telefono;
    private String email;
    private String password;
    private String Username;
    private Boolean aux;
    private List<Role> roles;

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
        return password;
    }

    public void setContrasenia(String password) {
        this.password = password;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
