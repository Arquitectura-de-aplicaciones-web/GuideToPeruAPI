package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.CompraDTO;
import pe.edu.upc.guidetoperu.entities.Compra;
import pe.edu.upc.guidetoperu.services.ICompraService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    private ICompraService cS;
    @PostMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void insert(@RequestBody CompraDTO dto){
        ModelMapper m = new ModelMapper();
        Compra c = m.map(dto, Compra.class);
        cS.insert(c);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('CLIENTE')")
    public List<CompraDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CompraDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete (@PathVariable("id")Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('CLIENTE')")
    public CompraDTO listId (@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        CompraDTO dto = m.map(cS.listId(id),CompraDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody CompraDTO dto ){
        ModelMapper m = new ModelMapper();
        Compra c = m.map(dto, Compra.class);
        cS.insert(c);

    }
}
