package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.NegocioDTO;
import pe.edu.upc.guidetoperu.entities.Negocio;
import pe.edu.upc.guidetoperu.services.INegocioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/negocio")
public class NegocioController {
    @Autowired
    private INegocioService nS;
    @PostMapping
    public void insert(@RequestBody NegocioDTO dto){
        ModelMapper m = new ModelMapper();
        Negocio n = m.map(dto,Negocio.class);
        nS.insert(n);
    }
    @GetMapping
    public List<NegocioDTO> list(){
        return nS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,NegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){
        nS.delete(id);
    }
    @GetMapping("/{id}")
    public NegocioDTO listId (@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        NegocioDTO dto = m.map(nS.listId(id),NegocioDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody NegocioDTO dto ){
        ModelMapper m = new ModelMapper();
        Negocio n = m.map(dto, Negocio.class);
        nS.insert(n);
    }
    
    @PostMapping("/{idTipoNegocio}")
    public List<Negocio> listByTipoNegocio(@PathVariable("idTipoNegocio") Integer idTipoNegocio){
        return nS.listByTipoNegocio(idTipoNegocio);
    }
}
