package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Usuario;
import pe.edu.upc.guidetoperu.repositories.IUsuarioRepository;
import pe.edu.upc.guidetoperu.services.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceRepository implements IUsuarioService {
    @Autowired
    public IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) { uR.save(usuario); }

    @Override
    public List<Usuario> list() { return uR.findAll(); }

    @Override
    public void delete(int id) { uR.deleteById(id); }

    @Override
    public Usuario listID(int id) { return uR.findById(id).orElse(new Usuario()); }

    @Override
    public List<Usuario> searchEmail(String email_to_search) {
        return uR.searchEmail(email_to_search);
    }

}
