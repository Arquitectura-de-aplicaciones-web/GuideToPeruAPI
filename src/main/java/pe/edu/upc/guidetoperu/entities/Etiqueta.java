package pe.edu.upc.guidetoperu.entities;

import javax.persistence.*;

@Entity
@Table(name = "etiquetas")
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtiqueta;
    @Column(name = "nombreEtiqueta", length = 20, nullable = false)
    private String nombreEtiqueta;

    public Etiqueta() {
    }

    public Etiqueta(int idEtiqueta, String nombreEtiqueta) {
        this.idEtiqueta = idEtiqueta;
        this.nombreEtiqueta = nombreEtiqueta;
    }

    public int getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(int idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public String getNombreEtiqueta() {
        return nombreEtiqueta;
    }

    public void setNombreEtiqueta(String nombreEtiqueta) {
        this.nombreEtiqueta = nombreEtiqueta;
    }
}
