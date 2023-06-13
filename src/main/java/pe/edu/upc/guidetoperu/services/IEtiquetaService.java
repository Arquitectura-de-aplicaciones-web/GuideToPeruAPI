package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Etiqueta;

import java.util.List;

public interface IEtiquetaService {
    public void insert(Etiqueta etiqueta);

    List<Etiqueta> list();

    public void delete(int idEtiqueta);

    public Etiqueta listId(int idEtiqueta);
}
