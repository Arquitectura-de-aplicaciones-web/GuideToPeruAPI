package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insert(@RequestBody EtiquetaProductoDTO dto){
        ModelMapper m = new ModelMapper();
        EtiquetaProducto ep = m.map(dto, EtiquetaProducto.class);
        epS.insert(ep);
    }
    @GetMapping
    public List<EtiquetaProductoDTO> list(){
        return epS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/etiqueta/{id}")
    public List<EtiquetaProductoDTO> listByEtiqueta(@PathVariable("id") Integer idEtiqueta){
        return epS.listByEtiqueta(idEtiqueta).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/producto/{id}")
    public List<EtiquetaProductoDTO> listByProducto(@PathVariable("id") int idProducto){
        return epS.listByProducto(idProducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/etiqueta-producto/{idetiqueta}-{idproducto}")
    public List<EtiquetaProductoDTO> listByEtiquetaProducto(@PathVariable("idetiqueta") Integer idEtiqueta, @PathVariable("idproducto") Integer idProducto){
        return epS.listByEtiquetaProducto(idEtiqueta, idProducto).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EtiquetaProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idEtiquetaProducto){
        epS.delete(idEtiquetaProducto);
    }
    @DeleteMapping("/etiqueta/{id}")
    public void deleteByEtiqueta(@PathVariable("id") Integer idEtiqueta){
        epS.deleteByEtiqueta(idEtiqueta);
        System.out.println(idEtiqueta);
    }
    public @DeleteMapping("/producto/{id}")
    void deleteByProducto(@PathVariable("id") Integer idProducto){
        epS.deleteByProducto(idProducto);
    }
    @DeleteMapping("/etiqueta-producto/{idetiqueta}-{idproducto}")
    public void deleteByEtiquetaProducto(@PathVariable("idetiqueta") Integer idEtiqueta, @PathVariable("idproducto") Integer idProducto){
        epS.deleteByEtiquetaProducto(idEtiqueta, idProducto);
    }
    @PutMapping
    public void update(@RequestBody EtiquetaProductoDTO dto){
        ModelMapper m = new ModelMapper();
        EtiquetaProducto ep = m.map(dto, EtiquetaProducto.class);
        epS.insert(ep);
    }
}
