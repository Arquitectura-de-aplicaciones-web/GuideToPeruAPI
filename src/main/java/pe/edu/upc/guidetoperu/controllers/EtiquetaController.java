package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insert(@RequestBody EtiquetaDTO dto){
        ModelMapper m=new ModelMapper();
        Etiqueta e = m.map(dto, Etiqueta.class);
        eS.insert(e);

    }
    @GetMapping
    public List<EtiquetaDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){
        eS.delete(id);
    }
    @GetMapping("/{id}")
    public EtiquetaDTO listId (@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EtiquetaDTO dto = m.map(eS.listId(id),EtiquetaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody EtiquetaDTO dto ){
        ModelMapper m = new ModelMapper();
        Etiqueta e = m.map(dto, Etiqueta.class);
        eS.insert(e);

    }
}
