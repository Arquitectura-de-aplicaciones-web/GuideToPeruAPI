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
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody ComentarioProductoDTO dto){
        ModelMapper m = new ModelMapper();
        ComentarioProducto cp = m.map(dto, ComentarioProducto.class);
        cpS.insert(cp);
    }
    @GetMapping
    public List<ComentarioProductoDTO> list(){
        return cpS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cliente/{id}")
    public List<ComentarioProductoDTO> listByCliente(@PathVariable("id") Integer idCliente){
        return cpS.listByCliente(idCliente).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/producto/{id}")
    public List<ComentarioProductoDTO> listByProducto(@PathVariable("id") int idProducto){
        return cpS.listByProducto(idProducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cliente-producto/{idcliente}-{idproducto}")
    public List<ComentarioProductoDTO> listByClienteProducto(@PathVariable("idcliente") Integer idCliente, @PathVariable("idproducto") Integer idProducto){
        return cpS.listByClienteProducto(idCliente, idProducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idComentarioProducto){
        cpS.delete(idComentarioProducto);
    }
    @DeleteMapping("/cliente/{id}")
    public void deleteByCliente(@PathVariable("id") Integer idCliente){
        cpS.deleteByCliente(idCliente);
        System.out.println(idCliente);
    }
    public @DeleteMapping("/producto/{id}")
    void deleteByProducto(@PathVariable("id") Integer idProducto){
        cpS.deleteByProducto(idProducto);
    }
    @DeleteMapping("/cliente-producto/{idcliente}-{idproducto}")
    public void deleteByClienteProducto(@PathVariable("idcliente") Integer idCliente, @PathVariable("idproducto") Integer idProducto){
        cpS.deleteByClienteProducto(idCliente, idProducto);
    }
    @PutMapping
    public void update(@RequestBody ComentarioProductoDTO dto){
        ModelMapper m = new ModelMapper();
        ComentarioProducto cp = m.map(dto, ComentarioProducto.class);
        cpS.insert(cp);
    }
}
