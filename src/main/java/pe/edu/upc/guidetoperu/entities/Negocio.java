package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name="negocios")
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nameNegocio", length = 60, nullable = false)
    private String nameNegocio;
    @Column(name = "direccionNegocio", length = 40, nullable = false)
    private String direccionNegocio;

    @Column(name = "TipoNegocio", length = 40, nullable = false)
    private String TipoNegocio;

    @OneToOne
    @JoinColumn(name = "IDusuario")
    private Users IDusuario;
    @Column (name = "calificacion", length = 40, nullable = false)
    private int calificacion;

    public Negocio() {
    }

    public Negocio(int id, String nameNegocio, String direccionNegocio, String TipoNegocio, Users IDusuario, int calificacion) {
        this.id = id;
        this.nameNegocio = nameNegocio;
        this.direccionNegocio = direccionNegocio;
        this.TipoNegocio = TipoNegocio;
        this.IDusuario = IDusuario;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNegocio() {
        return nameNegocio;
    }

    public void setNameNegocio(String nameNegocio) {
        this.nameNegocio = nameNegocio;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public String getTipoNegocio() {
        return TipoNegocio;
    }

    public void setTipoNegocio(String TipoNegocio) {
        this.TipoNegocio = TipoNegocio;
    }

    public Users getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(Users IDusuario) {
        this.IDusuario = IDusuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
