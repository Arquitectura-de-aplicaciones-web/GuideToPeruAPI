package pe.edu.upc.guidetoperu.dtos;

public class ComentariodecadaProductoDTO{
    private String nombre;
   private String comentario;

    public ComentariodecadaProductoDTO() {
    }

    public ComentariodecadaProductoDTO(String nombre, String comentario) {
        this.nombre = nombre;
        this.comentario = comentario;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }




}
