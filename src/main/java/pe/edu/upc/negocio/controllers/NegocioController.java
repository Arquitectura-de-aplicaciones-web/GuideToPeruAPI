package pe.edu.upc.negocio.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.negocio.dtos.NegocioDTO;
import pe.edu.upc.negocio.entities.Negocio;
import pe.edu.upc.negocio.services.INegocioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/negocio")
public class NegocioController {
    @Autowired
    private INegocioService aS;
    @PostMapping
    public void insert(@RequestBody NegocioDTO dto){
        ModelMapper m=new ModelMapper();
       Negocio a =m.map(dto,Negocio.class);
        aS.insert(a);

    }
    @GetMapping
    public List<NegocioDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public NegocioDTO listId (@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        NegocioDTO dto=m.map(aS.listId(id),NegocioDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody NegocioDTO dto ){
        ModelMapper m=new ModelMapper();
        Negocio a=m.map(dto, Negocio.class);
        aS.insert(a);

    }

}
