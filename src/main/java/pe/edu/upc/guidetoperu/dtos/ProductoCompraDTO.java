package pe.edu.upc.guidetoperu.dtos;

public class ProductoCompraDTO {

    private String name;
    private int compraCount;

    public ProductoCompraDTO() {
    }

    public ProductoCompraDTO(String name, int compraCount) {
        this.name = name;
        this.compraCount = compraCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompraCount() {
        return compraCount;
    }

    public void setCompraCount(int compraCount) {
        this.compraCount = compraCount;
    }
}
