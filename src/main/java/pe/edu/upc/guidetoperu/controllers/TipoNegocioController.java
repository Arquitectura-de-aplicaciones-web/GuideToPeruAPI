package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insert(@RequestBody TipoNegocioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoNegocio tn = m.map(dto, TipoNegocio.class);
        tnS.insert(tn);

    }
    @GetMapping
    public List<TipoNegocioDTO> list(){
        return tnS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoNegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){
        tnS.delete(id);
    }
    @GetMapping("/{id}")
    public TipoNegocioDTO listId (@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        TipoNegocioDTO dto =m.map(tnS.listId(id),TipoNegocioDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody TipoNegocioDTO dto ){
        ModelMapper m = new ModelMapper();
        TipoNegocio tn = m.map(dto, TipoNegocio.class);
        tnS.insert(tn);

    }
    
}
