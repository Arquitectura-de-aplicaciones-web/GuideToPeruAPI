package pe.edu.upc.guidetoperu.controllers;

import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.UserDTO;
import pe.edu.upc.guidetoperu.entities.User;
import pe.edu.upc.guidetoperu.services.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void insert(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        User u = m.map(dto, User.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UserDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDTO listID(@PathVariable("id") Integer idUser) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listID(idUser), UserDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idUser) {
        uS.delete(idUser);
    }

    @PutMapping
    public void update(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        User u = m.map(dto, User.class);
        uS.insert(u);
    }

    @PostMapping("/searchEmail")
    public List<UserDTO> searchEmail(@RequestBody String email) {
        return uS.searchEmail(email).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/searchUsername")
    public List<UserDTO> searchUsername(@RequestBody String username) {
        return uS.searchUsernameStartWith(username).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
}
