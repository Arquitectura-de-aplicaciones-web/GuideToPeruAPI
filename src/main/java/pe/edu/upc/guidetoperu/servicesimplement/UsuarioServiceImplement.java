package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Usuario;
import pe.edu.upc.guidetoperu.repositories.IUsuarioRepository;
import pe.edu.upc.guidetoperu.services.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    public IUsuarioRepository uR;

    @Override
    public void insert(Usuario user) { uR.save(user); }

    @Override
    public List<Usuario> list() { return uR.findAll(); }

    @Override
    public void delete(int idUsuario) { uR.deleteById(idUsuario); }

    @Override
    public Usuario listID(int idUsuario) { return uR.findById(idUsuario).orElse(new Usuario()); }

    @Override
    public List<Usuario> searchEmail(String email_to_search) {
        return uR.searchEmail(email_to_search);
    }

    @Override
    public List<Usuario> searchUsuarionameStartWith(String username) {
        return uR.searchUsernameStartWith(username);
    }

}
