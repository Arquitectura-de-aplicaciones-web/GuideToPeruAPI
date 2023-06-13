package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.UsuarioDTO;
import pe.edu.upc.guidetoperu.entities.Usuario;
import pe.edu.upc.guidetoperu.services.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @PostMapping
    public void insert(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UsuarioDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UsuarioDTO listID(@PathVariable("id") Integer idUsuario) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listID(idUsuario), UsuarioDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idUsuario) {
        uS.delete(idUsuario);
    }

    @PutMapping
    public void update(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }

    @PostMapping("/searchEmail")
    public List<UsuarioDTO> searchEmail(@RequestBody String email) {
        return uS.searchEmail(email).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/searchUsuarioname")
    public List<UsuarioDTO> searchUsuarioname(@RequestBody String username) {
        return uS.searchUsuarionameStartWith(username).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
