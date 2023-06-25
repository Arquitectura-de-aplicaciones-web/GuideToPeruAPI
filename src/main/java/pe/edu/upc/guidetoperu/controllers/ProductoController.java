package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.*;
import pe.edu.upc.guidetoperu.entities.Producto;
import pe.edu.upc.guidetoperu.services.IProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService pS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('NEGOCIO')")
    public void insert(@RequestBody ProductoDTO dto){
        ModelMapper m=new ModelMapper();
        Producto a =m.map(dto, Producto.class);
        pS.insert(a);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('CLIENTE') or hasAnyAuthority('NEGOCIO')")
    public List<ProductoDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('NEGOCIO')")
    public void delete (@PathVariable("id")Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('NEGOCIO')")
    public ProductoDTO listId (@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ProductoDTO dto=m.map(pS.listId(id),ProductoDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('NEGOCIO')")
    public void goUpdate(@RequestBody ProductoDTO dto ){
        ModelMapper m=new ModelMapper();
        Producto a=m.map(dto, Producto.class);
        pS.insert(a);
    }


    @GetMapping("/producto-comentario")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ComentariodecadaProductoDTO> getProductosConComentarios() {
        List<ComentariodecadaProductoDTO> ComentariodecadaProductoDTOs = pS.reporte3();
        return ComentariodecadaProductoDTOs;
    }


    @GetMapping ("/productocalificado")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ProductocalificadosDTO> reporte4 (){
        return pS.reporte4().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductocalificadosDTO.class);
        }).collect(Collectors.toList());
    }

}
