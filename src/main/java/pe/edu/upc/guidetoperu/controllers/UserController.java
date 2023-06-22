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
import pe.edu.upc.guidetoperu.dtos.UserDTO;
import pe.edu.upc.guidetoperu.entities.Users;
import pe.edu.upc.guidetoperu.services.IUserService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Secured({"ADMIN"})
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IUserService uS;

    @PostMapping("/save")
    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = bcrypt.encode(user.getPassword());
            user.setPassword(bcryptPassword);
            int rpta = uS.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uS.list());

        return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UserDTO> list() {
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UserDTO.class);

        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public UserDTO listID(@PathVariable("id") Integer idUser) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listID(idUser), UserDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer idUser) {
        uS.delete(idUser);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void update(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }


}
