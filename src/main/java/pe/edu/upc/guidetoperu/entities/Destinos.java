package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "destinos")
public class  Destinos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idDestinos;
    @Column(name = "nameDestinos", length = 60, nullable = false)
     private String nameDestinos;
    @Column(name = "ubicacionDestinos", length = 60, nullable = false)
     private String ubicacionDestinos;
    @Column(name = "descripcionDestinos", length = 60, nullable = false)
    private String descripcionDestinos;
    @Column(name = "imagenDestinos", length = 60, nullable = false)
    private String imagenDestinos;
    @Column(name = "distritoDestinos", length = 60, nullable = false)
    private String distritoDestinos;
    @Column(name = "departarmentoDestinos", length = 60, nullable = false)
    private String departarmentoDestinos;


    public Destinos() {
    }

    public Destinos(int idDestinos, String nameDestinos, String ubicacionDestinos,
                    String descripcionDestinos, String imagenDestinos, String distritoDestinos,
                    String departarmentoDestinos) {
        this.idDestinos = idDestinos;
        this.nameDestinos = nameDestinos;
        this.ubicacionDestinos = ubicacionDestinos;
        this.descripcionDestinos = descripcionDestinos;
        this.imagenDestinos = imagenDestinos;
        this.distritoDestinos = distritoDestinos;
        this.departarmentoDestinos = departarmentoDestinos;
    }

    public int getIdDestinos() {
        return idDestinos;
    }

    public void setIdDestinos(int idDestinos) {
        this.idDestinos = idDestinos;
    }

    public String getNameDestinos() {
        return nameDestinos;
    }

    public void setNameDestinos(String nameDestinos) {
        this.nameDestinos = nameDestinos;
    }

    public String getUbicacionDestinos() {
        return ubicacionDestinos;
    }

    public void setUbicacionDestinos(String ubicacionDestinos) {
        this.ubicacionDestinos = ubicacionDestinos;
    }

    public String getDescripcionDestinos() {
        return descripcionDestinos;
    }

    public void setDescripcionDestinos(String descripcionDestinos) {
        this.descripcionDestinos = descripcionDestinos;
    }

    public String getImagenDestinos() {
        return imagenDestinos;
    }

    public void setImagenDestinos(String imagenDestinos) {
        this.imagenDestinos = imagenDestinos;
    }

    public String getDistritoDestinos() {
        return distritoDestinos;
    }

    public void setDistritoDestinos(String distritoDestinos) {
        this.distritoDestinos = distritoDestinos;
    }

    public String getDepartarmentoDestinos() {
        return departarmentoDestinos;
    }

    public void setDepartarmentoDestinos(String departarmentoDestinos) {
        this.departarmentoDestinos = departarmentoDestinos;
    }
}
