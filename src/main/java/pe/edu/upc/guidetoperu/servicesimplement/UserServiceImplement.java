package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Users;
import pe.edu.upc.guidetoperu.repositories.IUserRepository;
import pe.edu.upc.guidetoperu.services.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    public IUserRepository uR;

    @Override
    public void delete(int id) { uR.deleteById(id); }

    @Override
    public Users listID(int id) { return uR.findById(id).orElse(new Users()); }

    @Override
    public Integer insert(Users users) {
        int rpta = uR.buscarUsername(users.getUsername());
        if (rpta == 0) {
            uR.save(users);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return uR.findAll();
    }

}
