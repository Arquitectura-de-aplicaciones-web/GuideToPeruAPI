package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Users;

import java.util.List;

public interface IUserService {

    public Integer insert(Users users);

    public List<Users> list();

    public void delete(int id);

    public Users listID(int id);

}
