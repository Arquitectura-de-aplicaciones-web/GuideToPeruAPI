package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Rol;

import java.util.List;

public interface IRolService {

    public void insert(Rol role);

    List<Rol> list();

}
