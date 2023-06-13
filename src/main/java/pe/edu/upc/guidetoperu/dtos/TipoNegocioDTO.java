package pe.edu.upc.guidetoperu.dtos;


public class TipoNegocioDTO {
    private int idTipoNegocio;

    private String nombre;

    private String descripcion;

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
