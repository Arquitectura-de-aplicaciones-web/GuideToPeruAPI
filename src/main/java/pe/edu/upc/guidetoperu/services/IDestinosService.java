package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.dtos.DestinosDTO;
import pe.edu.upc.guidetoperu.entities.Destinos;
import pe.edu.upc.guidetoperu.dtos.depaDTO;

import java.util.List;

public interface IDestinosService {

    public void insertar(Destinos destinos);

    public void eliminar(int id);

    public Destinos listarId(int id);

    List<Destinos> listar();

    public List<depaDTO> reporte2();

}
