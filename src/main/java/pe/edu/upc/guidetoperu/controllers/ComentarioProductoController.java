package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.ComentarioProductoDTO;
import pe.edu.upc.guidetoperu.entities.ComentarioProducto;
import pe.edu.upc.guidetoperu.services.IComentarioProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentario_producto")
public class ComentarioProductoController {
    @Autowired
    private IComentarioProductoService cpS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE')")
    public void insert(@RequestBody ComentarioProductoDTO dto){
        ModelMapper m = new ModelMapper();
        ComentarioProducto cp = m.map(dto, ComentarioProducto.class);
        cpS.insert(cp);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE') or hasAnyAuthority('NEGOCIO')")
    public List<ComentarioProductoDTO> list(){
        return cpS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cliente/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE') or hasAnyAuthority('NEGOCIO')")
    public List<ComentarioProductoDTO> listByCliente(@PathVariable("id") Integer idcliente){
        return cpS.listByCliente(idcliente).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/producto/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE') or hasAnyAuthority('NEGOCIO')")
    public List<ComentarioProductoDTO> listByProducto(@PathVariable("id") int idproducto){
        return cpS.listByProducto(idproducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cliente-producto/{idcliente}-{idproducto}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE') or hasAnyAuthority('NEGOCIO')")
    public List<ComentarioProductoDTO> listByClienteProducto(@PathVariable("idcliente") Integer idcliente, @PathVariable("idproducto") Integer idproducto){
        return cpS.listByClienteProducto(idcliente, idproducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer idComentarioProducto){
        cpS.delete(idComentarioProducto);
    }
    @DeleteMapping("/cliente/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteByCliente(@PathVariable("id") Integer idcliente){
        cpS.deleteByCliente(idcliente);
        System.out.println(idcliente);
    }
    public @DeleteMapping("/producto/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    void deleteByProducto(@PathVariable("id") Integer idproducto){
        cpS.deleteByProducto(idproducto);
    }
    @DeleteMapping("/cliente-producto/{idcliente}-{idproducto}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteByClienteProducto(@PathVariable("idcliente") Integer idcliente, @PathVariable("idproducto") Integer idproducto){
        cpS.deleteByClienteProducto(idcliente, idproducto);
    }
    @PutMapping
    public void update(@RequestBody ComentarioProductoDTO dto){
        ModelMapper m = new ModelMapper();
        ComentarioProducto cp = m.map(dto, ComentarioProducto.class);
        cpS.insert(cp);
    }
}
