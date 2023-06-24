package pe.edu.upc.guidetoperu.dtos;

public class depaDTO {
    private String departarmento;
    private int departarmentoCount;

    public depaDTO() {
    }

    public depaDTO(String departarmento, int departarmentoCount) {
        this.departarmento = departarmento;
        this.departarmentoCount = departarmentoCount;
    }



    public String getDepartarmento() {
        return departarmento;
    }

    public void setDepartarmento(String departarmento) {
        this.departarmento = departarmento;
    }

    public int getDepartarmentoCount() {
        return departarmentoCount;
    }

    public void setDepartarmentoCount(int departarmentoCount) {
        this.departarmentoCount = departarmentoCount;
    }


}
