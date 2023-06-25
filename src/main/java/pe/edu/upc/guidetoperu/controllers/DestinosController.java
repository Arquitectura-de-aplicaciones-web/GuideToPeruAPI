package pe.edu.upc.guidetoperu.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.guidetoperu.dtos.DestinosDTO;
import pe.edu.upc.guidetoperu.dtos.distriDTO;
import pe.edu.upc.guidetoperu.entities.Destinos;
import pe.edu.upc.guidetoperu.services.IDestinosService;
import pe.edu.upc.guidetoperu.dtos.depaDTO;
import pe.edu.upc.guidetoperu.dtos.depaDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/destinos")
public class DestinosController {
    @Autowired
    private IDestinosService aS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody DestinosDTO dto) {
        ModelMapper m = new ModelMapper();
        Destinos a = m.map(dto, Destinos.class);
        aS.insertar(a);
    }


    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody DestinosDTO dto) {
        ModelMapper m = new ModelMapper();
        Destinos a = m.map(dto, Destinos.class);
        aS.insertar(a);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.eliminar(id);
    }


    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public DestinosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        DestinosDTO dto=m.map(aS.listarId(id),DestinosDTO.class);
        return dto;
    }

    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('CLIENTE') or hasAuthority('NEGOCIO')")
    @GetMapping
    public List<DestinosDTO> listar() {
        return aS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DestinosDTO.class);

        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/departamento-count")
    public List<depaDTO> getdepartarmentovisitados() {
        List<depaDTO> depaDTOs = aS.reporte2();
        return depaDTOs;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/distrito-count")
    public List<distriDTO> getdistritosvisitados() {
        List<distriDTO> distriDTOs = aS.reporte4();
        return distriDTOs;
    }


}
