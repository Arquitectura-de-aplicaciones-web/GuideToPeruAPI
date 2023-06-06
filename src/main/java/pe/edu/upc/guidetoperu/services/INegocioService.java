package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Negocio;

import java.util.List;

public interface INegocioService {
    public void insert(Negocio negocio);

    List<Negocio> list();


    public void delete(int idNegocio);

    public Negocio listId(int idNegocio);
}