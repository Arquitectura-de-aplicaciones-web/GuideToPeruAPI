package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.dtos.distriDTO;
import pe.edu.upc.guidetoperu.entities.Destinos;
import pe.edu.upc.guidetoperu.repositories.IDestinosRepository;
import pe.edu.upc.guidetoperu.services.IDestinosService;
import pe.edu.upc.guidetoperu.dtos.depaDTO;
import java.util.ArrayList;
import java.util.List;
@Service
public class DestinosServiceImplement implements IDestinosService {

    @Autowired
    private IDestinosRepository irD;

    @Override
    public void insertar(Destinos destinos) {
        irD.save(destinos);
    }

    @Override
    public void eliminar(int id) {
        irD.deleteById(id);
    }

    @Override
    public Destinos listarId(int id) {
        return irD.findById(id).orElse(new Destinos());
    }

    @Override
    public List<Destinos> listar() {
        return irD.findAll();
    }




    @Override
    public List<depaDTO> reporte2() {
        List<String[]> departarmentovisitados = irD.getdepartarmentovisitados();
        List<depaDTO> depaDTOs = new ArrayList<>();
        for (String[] data : departarmentovisitados) {
            depaDTO dto = new depaDTO();
            dto.setDepartarmento(data[0]);
            dto.setDepartarmentoCount(Integer.parseInt(data[1]));
            depaDTOs.add(dto);
        }
        return depaDTOs;
    }

    @Override
    public List<distriDTO> reporte4() {
        List<String[]> distritosvisitados = irD.getdistritosvisitados();
        List<distriDTO> distriDTOs = new ArrayList<>();
        for (String[] data : distritosvisitados) {
            distriDTO dto = new distriDTO();
            dto.setDistrito(data[0]);
            dto.setDistritoCount(Integer.parseInt(data[1]));
            distriDTOs.add(dto);
        }
        return distriDTOs;
    }



}
