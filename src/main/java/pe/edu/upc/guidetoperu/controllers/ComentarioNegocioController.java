package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.ComentarioNegocioDTO;
import pe.edu.upc.guidetoperu.entities.ComentarioNegocio;
import pe.edu.upc.guidetoperu.services.IComentarioNegocioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentario_negocio")
public class ComentarioNegocioController {
    @Autowired
    private IComentarioNegocioService cnS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE')")
    public void insert(@RequestBody ComentarioNegocioDTO dto){
        ModelMapper m = new ModelMapper();
        ComentarioNegocio cn = m.map(dto, ComentarioNegocio.class);
        cnS.insert(cn);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE') or hasAnyAuthority('NEGOCIO')")
    public List<ComentarioNegocioDTO> list(){
        return cnS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioNegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cliente/{id}")
    public List<ComentarioNegocioDTO> listByCliente(@PathVariable("id") Integer idCliente){
        return cnS.listByCliente(idCliente).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioNegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/negocio/{id}")
    public List<ComentarioNegocioDTO> listByNegocio(@PathVariable("id") int idNegocio){
        return cnS.listByNegocio(idNegocio).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioNegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cliente-negocio/{idcliente}-{idnegocio}")
    public List<ComentarioNegocioDTO> listByClienteNegocio(@PathVariable("idcliente") Integer idCliente, @PathVariable("idnegocio") Integer idNegocio){
        return cnS.listByClienteNegocio(idCliente, idNegocio).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioNegocioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer idComentarioNegocio){
        cnS.delete(idComentarioNegocio);
    }
    @DeleteMapping("/cliente/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteByCliente(@PathVariable("id") Integer idCliente){
        cnS.deleteByCliente(idCliente);
        System.out.println(idCliente);
    }
    public @DeleteMapping("/negocio/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    void deleteByNegocio(@PathVariable("id") Integer idNegocio){
        cnS.deleteByNegocio(idNegocio);
    }
    @DeleteMapping("/cliente-negocio/{idcliente}-{idnegocio}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteByClienteNegocio(@PathVariable("idcliente") Integer idCliente, @PathVariable("idnegocio") Integer idNegocio){
        cnS.deleteByClienteNegocio(idCliente, idNegocio);
    }
    @PutMapping
    public void update(@RequestBody ComentarioNegocioDTO dto){
        ModelMapper m = new ModelMapper();
        ComentarioNegocio cn = m.map(dto, ComentarioNegocio.class);
        cnS.insert(cn);
    }
}
