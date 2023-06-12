package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.UsuarioDTO;
import pe.edu.upc.guidetoperu.entities.Usuario;
import pe.edu.upc.guidetoperu.services.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
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

    @PostMapping("/searchEmail")
    public List<UsuarioDTO> searchEmail(@RequestBody String email) {
        return uS.searchEmail(email).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }


}
