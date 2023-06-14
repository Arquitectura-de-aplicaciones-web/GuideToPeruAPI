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
    public void delete(int id) { uR.deleteById(id); }

    @Override
    public Usuario listID(int id) { return uR.findById(id).orElse(new Usuario()); }

    @Override
    public Integer insert(Usuario user) {
        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Usuario> list() {
        // TODO Auto-generated method stub
        return uR.findAll();
    }

}
