package pe.edu.upc.guidetoperu.services;


import pe.edu.upc.guidetoperu.entities.Producto;
import pe.edu.upc.guidetoperu.entities.TipoNegocio;

import java.util.List;

public interface ITipoNegocioService {

    public void insert(TipoNegocio tipoNegocio);

    List<TipoNegocio> list();

    public void delete(int idTipoNegocio);

    public TipoNegocio listId(int idTipoNegocio);
}
