package pe.edu.upc.guidetoperu.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.ClienteDTO;
import pe.edu.upc.guidetoperu.entities.Cliente;
import pe.edu.upc.guidetoperu.services.IClienteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody ClienteDTO dto){
        ModelMapper m=new ModelMapper();
        Cliente c=m.map(dto,Cliente.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ClienteDTO> list() {
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClienteDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
 public void  delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping ("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ClienteDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ClienteDTO dto=m.map(cS.listID(id), ClienteDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public  void goUpdate (@RequestBody ClienteDTO dto){
        ModelMapper m=new ModelMapper();
        Cliente c=m.map(dto,Cliente.class);
        cS.insert(c);
    }


}
