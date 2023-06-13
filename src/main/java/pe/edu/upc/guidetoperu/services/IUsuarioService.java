package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario user);
    public List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listID(int idUsuario);
    public List<Usuario> searchEmail(String email_to_search);
    public List<Usuario> searchUsuarionameStartWith(String username);
}
