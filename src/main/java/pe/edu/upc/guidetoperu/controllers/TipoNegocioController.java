package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.TipoNegocioDTO;
import pe.edu.upc.guidetoperu.entities.TipoNegocio;
import pe.edu.upc.guidetoperu.services.ITipoNegocioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_negocio")
public class TipoNegocioController {
    @Autowired
    private ITipoNegocioService tnS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody TipoNegocioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoNegocio tn = m.map(dto, TipoNegocio.class);
        tnS.insert(tn);

    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TipoNegocioDTO> list(){
        return tnS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoNegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete (@PathVariable("id")Integer id){
        tnS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public TipoNegocioDTO listId (@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        TipoNegocioDTO dto =m.map(tnS.listId(id),TipoNegocioDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody TipoNegocioDTO dto ){
        ModelMapper m = new ModelMapper();
        TipoNegocio tn = m.map(dto, TipoNegocio.class);
        tnS.insert(tn);

    }
    
}
