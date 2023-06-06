package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Destinos;
import pe.edu.upc.guidetoperu.repositories.IDestinosRepository;
import pe.edu.upc.guidetoperu.services.IDestinosService;

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
    public void eliminar(int idDestinos) {
        irD.deleteById(idDestinos);
    }

    @Override
    public Destinos listarId(int idDestinos) {
        return irD.findById(idDestinos).orElse(new Destinos());
    }

    @Override
    public List<Destinos> listar() {
        return irD.findAll();
    }
}
