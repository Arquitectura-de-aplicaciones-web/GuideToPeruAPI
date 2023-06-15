package pe.edu.upc.guidetoperu.dtos;

import pe.edu.upc.guidetoperu.entities.Users;

public class RoleDTO {

    private int id;
    private String rol;
    private Users users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }
}
