package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "contrasenia", length = 20, nullable = false)
    private String contrasenia;
    @Column (name="Username", length = 20, nullable = false)
    private String Username;
    private Boolean aux;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Rol> roles;

    public Usuario() { }

    public Usuario(int id, String telefono, String email, String contrasenia, String username, Boolean aux, List<Rol> roles) {
        this.id = id;
        this.telefono = telefono;
        this.email = email;
        this.contrasenia = contrasenia;
        Username = username;
        this.aux = aux;
        this.roles = roles;
    }

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
