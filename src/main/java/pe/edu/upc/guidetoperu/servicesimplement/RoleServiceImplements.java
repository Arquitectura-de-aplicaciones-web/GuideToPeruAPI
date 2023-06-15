package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Role;
import pe.edu.upc.guidetoperu.repositories.IRoleRepository;
import pe.edu.upc.guidetoperu.services.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplements implements IRoleService {

    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }

}
