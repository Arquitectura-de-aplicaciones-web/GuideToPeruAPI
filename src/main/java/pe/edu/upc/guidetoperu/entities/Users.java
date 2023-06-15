package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "password", length = 200, nullable = false)
    private String password;
    @Column (name="Username", length = 20, unique = true)
    private String username;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Users() { }

    public Users(int id, String telefono, String email, String password, String username, Boolean enabled, List<Role> roles) {
        this.id = id;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.username = username;
        this.enabled = enabled;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
