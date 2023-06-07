package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert(Usuario usuario);

    public List<Usuario> list();

    public void delete(int idUser);

    public Usuario listID(int idUser);
    public List<Usuario> searchEmail(String email_to_search);

}
