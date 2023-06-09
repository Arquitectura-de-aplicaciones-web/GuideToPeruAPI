package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.EtiquetaProductoDTO;
import pe.edu.upc.guidetoperu.entities.EtiquetaProducto;
import pe.edu.upc.guidetoperu.services.IEtiquetaProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/etiqueta-producto")
public class EtiquetaProductoController {
    @Autowired
    private IEtiquetaProductoService epS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody EtiquetaProductoDTO dto){
        ModelMapper m = new ModelMapper();
        EtiquetaProducto ep = m.map(dto, EtiquetaProducto.class);
        epS.insert(ep);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('CLIENTE')")
    public List<EtiquetaProductoDTO> list(){
        return epS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/etiqueta/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<EtiquetaProductoDTO> listByEtiqueta(@PathVariable("id") Integer idEtiqueta){
        return epS.listByEtiqueta(idEtiqueta).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/producto/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<EtiquetaProductoDTO> listByProducto(@PathVariable("id") int idproducto){
        return epS.listByProducto(idproducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/etiqueta-producto/{idetiqueta}-{idproducto}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<EtiquetaProductoDTO> listByEtiquetaProducto(@PathVariable("idetiqueta") Integer idEtiqueta, @PathVariable("idproducto") Integer idproducto){
        return epS.listByEtiquetaProducto(idEtiqueta, idproducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer idEtiquetaProducto){
        epS.delete(idEtiquetaProducto);
    }
    @DeleteMapping("/etiqueta/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteByEtiqueta(@PathVariable("id") Integer idEtiqueta){
        epS.deleteByEtiqueta(idEtiqueta);
        System.out.println(idEtiqueta);
    }
    public @DeleteMapping("/producto/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    void deleteByProducto(@PathVariable("id") Integer idproducto){
        epS.deleteByProducto(idproducto);
    }
    @DeleteMapping("/etiqueta-producto/{idetiqueta}-{idproducto}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteByEtiquetaProducto(@PathVariable("idetiqueta") Integer idEtiqueta, @PathVariable("idproducto") Integer idproducto){
        epS.deleteByEtiquetaProducto(idEtiqueta, idproducto);
    }
    @PutMapping
    public void update(@RequestBody EtiquetaProductoDTO dto){
        ModelMapper m = new ModelMapper();
        EtiquetaProducto ep = m.map(dto, EtiquetaProducto.class);
        epS.insert(ep);
    }
}
