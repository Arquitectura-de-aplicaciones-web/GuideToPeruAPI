package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Rol;
import pe.edu.upc.guidetoperu.repositories.IRolRepository;
import pe.edu.upc.guidetoperu.services.IRolService;

import java.util.List;

@Service
public class RolServiceImplements implements IRolService {

    @Autowired
    private IRolRepository rR;

    @Override
    public void insert(Rol role) {
        rR.save(role);
    }

    @Override
    public List<Rol> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }

}
