package pe.edu.upc.guidetoperu.services;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.guidetoperu.entities.User;

import java.util.List;

public interface IUserService {

    public void insert(User user);

    public List<User> list();

    public void delete(int idUser);

    public User listID(int idUser);
    public List<User> searchEmail(String email_to_search);
    public List<User> searchUsernameStartWith(String username);
}
