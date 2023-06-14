package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.guidetoperu.dtos.UsuarioDTO;
import pe.edu.upc.guidetoperu.entities.Usuario;
import pe.edu.upc.guidetoperu.services.IUsuarioService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Secured({"ROLE_ADMIN"})
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IUsuarioService uS;

    @PostMapping("/save")
    public String saveUser(@Valid Usuario user, BindingResult result, Model model, SessionStatus status)
            throws Exception {
        if (result.hasErrors()) {
            return "usuariosecurity/usuario";
        } else {
            String bcryptPassword = bcrypt.encode(user.getContrasenia());
            user.setContrasenia(bcryptPassword);
            int rpta = uS.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usuariosecurity/usuario";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uS.list());

        return "usuariosecurity/listUsuario";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("usuario", new Usuario());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usuariosecurity/listUser";
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UsuarioDTO> list() {
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);

        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UsuarioDTO listID(@PathVariable("id") Integer idUser) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listID(idUser), UsuarioDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idUser) {
        uS.delete(idUser);
    }

    @PutMapping
    public void update(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }


}
