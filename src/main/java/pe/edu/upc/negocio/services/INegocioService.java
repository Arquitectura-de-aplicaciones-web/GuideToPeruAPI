package pe.edu.upc.negocio.services;

import pe.edu.upc.negocio.entities.Negocio;

import java.util.List;

public interface INegocioService {
    public void insert(Negocio negocio);

    List<Negocio> list();


    public void delete(int idNegocio);

    public Negocio listId(int idNegocio);
}
