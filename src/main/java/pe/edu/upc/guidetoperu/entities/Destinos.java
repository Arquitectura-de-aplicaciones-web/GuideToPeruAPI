package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "destinos")
public class  Destinos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    @Column(name = "nombre", length = 60, nullable = false)
     private String nombre;
    @Column(name = "ubicacion", length = 60, nullable = false)
     private String ubicacion;
    @Column(name = "descripcion", length = 60, nullable = false)
    private String descripcion;
    @Column(name = "imagen", length = 60, nullable = false)
    private String imagen;
    @Column(name = "distrito", length = 60, nullable = false)
    private String distrito;
    @Column(name = "departarmento", length = 60, nullable = false)
    private String departarmento;


    public Destinos() {
    }

    public Destinos(int id, String nombre, String ubicacion, String descripcion, String imagen, String distrito, String departarmento) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.distrito = distrito;
        this.departarmento = departarmento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDepartarmento() {
        return departarmento;
    }

    public void setDepartarmento(String departarmento) {
        this.departarmento = departarmento;
    }
}
