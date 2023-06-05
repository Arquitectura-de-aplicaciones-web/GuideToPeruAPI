package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.User;
import pe.edu.upc.guidetoperu.repositories.IUserRepository;
import pe.edu.upc.guidetoperu.services.IUserService;

import java.util.List;

@Service
public class UserServiceRepository implements IUserService {
    @Autowired
    public IUserRepository uR;

    @Override
    public void insert(User user) { uR.save(user); }

    @Override
    public List<User> list() { return uR.findAll(); }

    @Override
    public void delete(int idUser) { uR.deleteById(idUser); }

    @Override
    public User listID(int idUser) { return uR.findById(idUser).orElse(new User()); }

    @Override
    public List<User> searchEmail(String email_to_search) {
        return uR.searchEmail(email_to_search);
    }

    @Override
    public List<User> searchUsernameStartWith(String username) { return uR.searchUsernameStartWith(username); }

}
