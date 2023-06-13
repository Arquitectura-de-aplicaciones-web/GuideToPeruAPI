package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipo_negocios")
public class TipoNegocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoNegocio;

    @Column(name = "nombreTipoNegocio", length = 20, nullable = false)
    private String nombre;

    @Column(name = "descripcionTipoNegocio")
    private String descripcion;

    public TipoNegocio() {
    }

    public TipoNegocio(int idTipoNegocio, String nombre, String descripcion) {
        this.idTipoNegocio = idTipoNegocio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdTipoNegocio() {
        return idTipoNegocio;
    }

    public void setIdTipoNegocio(int idTipoNegocio) {
        this.idTipoNegocio = idTipoNegocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
