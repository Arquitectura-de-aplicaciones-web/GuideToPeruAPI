package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.DestinosDTO;
import pe.edu.upc.guidetoperu.entities.Destinos;
import pe.edu.upc.guidetoperu.services.IDestinosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/destinos")
public class DestinosController {
    @Autowired
    private IDestinosService aS;

    @PostMapping
    public void registrar(@RequestBody DestinosDTO dto) {
        ModelMapper m = new ModelMapper();
        Destinos a = m.map(dto, Destinos.class);
        aS.insertar(a);
    }

    @PutMapping
    public void modificar(@RequestBody DestinosDTO dto) {
        ModelMapper m = new ModelMapper();
        Destinos a = m.map(dto, Destinos.class);
        aS.insertar(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.eliminar(id);
    }

    @GetMapping("/{id}")
    public DestinosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        DestinosDTO dto=m.map(aS.listarId(id),DestinosDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DestinosDTO> listar() {
        return aS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DestinosDTO.class);

        }).collect(Collectors.toList());
    }

}
