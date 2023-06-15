package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Role;

import java.util.List;

public interface IRoleService {

    public void insert(Role role);

    List<Role> list();

}
