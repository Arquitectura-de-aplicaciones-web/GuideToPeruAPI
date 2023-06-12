package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pe.edu.upc.guidetoperu.entities.Usuario;
import pe.edu.upc.guidetoperu.repositories.IUsuarioRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository repo;

    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Aqui lógica para buscar el usuario en BD
        //Usuario defecto web:password

        if ("web".equals(username)) {
            return new User("web", "$2a$12$CTtjF8P3IJVK6pP4w9pTxuldMqQRrfrLbLLIlasdu2K6ii2vWGly2",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }
    }*/
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario user = repo.findByUsername(email);

        if(user == null) {
            throw new UsernameNotFoundException(String.format("El correo no existe", email));
        }

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getContrasenia(), user.getEnabled(), true, true, true, roles);

        return ud;
    }

}