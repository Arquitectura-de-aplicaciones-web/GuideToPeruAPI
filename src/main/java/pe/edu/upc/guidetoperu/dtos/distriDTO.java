package pe.edu.upc.guidetoperu.dtos;

public class distriDTO {
    private String distrito;
    private int distritoCount;

    public distriDTO(){
            }

    public distriDTO(String distrito, int distritoCount) {
        this.distrito = distrito;
        this.distritoCount = distritoCount;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getDistritoCount() {
        return distritoCount;
    }

    public void setDistritoCount(int distritoCount) {
        this.distritoCount = distritoCount;
    }





}
