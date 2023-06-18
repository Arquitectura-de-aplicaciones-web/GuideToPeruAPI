package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.EtiquetaDTO;
import pe.edu.upc.guidetoperu.entities.Etiqueta;
import pe.edu.upc.guidetoperu.services.IEtiquetaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/etiqueta")
public class EtiquetaController {
    @Autowired
    private IEtiquetaService eS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody EtiquetaDTO dto){
        ModelMapper m=new ModelMapper();
        Etiqueta e = m.map(dto, Etiqueta.class);
        eS.insert(e);

    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<EtiquetaDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete (@PathVariable("id")Integer id){
        eS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public EtiquetaDTO listId (@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EtiquetaDTO dto = m.map(eS.listId(id),EtiquetaDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody EtiquetaDTO dto ){
        ModelMapper m = new ModelMapper();
        Etiqueta e = m.map(dto, Etiqueta.class);
        eS.insert(e);

    }
}
