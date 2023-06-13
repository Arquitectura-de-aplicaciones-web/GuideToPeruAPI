package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.ProductoDTO;
import pe.edu.upc.guidetoperu.entities.Producto;
import pe.edu.upc.guidetoperu.services.IProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoService pS;
    @PostMapping
    public void insert(@RequestBody ProductoDTO dto){
        ModelMapper m=new ModelMapper();
        Producto a =m.map(dto, Producto.class);
        pS.insert(a);
    }
    @GetMapping
    public List<ProductoDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public ProductoDTO listId (@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ProductoDTO dto=m.map(pS.listId(id),ProductoDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody ProductoDTO dto ){
        ModelMapper m=new ModelMapper();
        Producto a=m.map(dto, Producto.class);
        pS.insert(a);

    }
}
