package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.dtos.ComentariodecadaProductoDTO;
import pe.edu.upc.guidetoperu.dtos.ProductocalificadosDTO;
import pe.edu.upc.guidetoperu.dtos.depaDTO;
import pe.edu.upc.guidetoperu.entities.Producto;

import java.util.List;

public interface IProductoService {
    public void insert(Producto producto);

    List<Producto> list();

    public void delete(int idproducto);

    public Producto listId(int idproducto);

    public List<ComentariodecadaProductoDTO> reporte3();

    public List<ProductocalificadosDTO> reporte4();

}
