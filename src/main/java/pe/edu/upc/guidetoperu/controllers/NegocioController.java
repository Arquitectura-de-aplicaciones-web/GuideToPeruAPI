package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.NegocioDTO;
import pe.edu.upc.guidetoperu.entities.Negocio;
import pe.edu.upc.guidetoperu.services.INegocioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/negocios")
public class NegocioController {
    @Autowired
    private INegocioService aS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody NegocioDTO dto){
        ModelMapper m=new ModelMapper();
       Negocio a =m.map(dto,Negocio.class);
        aS.insert(a);

    }
    @GetMapping

    public List<NegocioDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NegocioDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete (@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public NegocioDTO listId (@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        NegocioDTO dto=m.map(aS.listId(id),NegocioDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody NegocioDTO dto ){
        ModelMapper m=new ModelMapper();
        Negocio a=m.map(dto, Negocio.class);
        aS.insert(a);

    }

}
