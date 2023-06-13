package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Negocio;
import pe.edu.upc.guidetoperu.repositories.INegocioRepository;
import pe.edu.upc.guidetoperu.services.INegocioService;

import java.util.List;

@Service
public class NegocioServiceImplement implements INegocioService {

    @Autowired
    private INegocioRepository nR;
    @Override
    public void insert(Negocio negocio) { nR.save(negocio); }

    @Override
    public List<Negocio> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int idNegocio) { nR.deleteById(idNegocio); }

    @Override
    public Negocio listId(int idNegocio) {
        return nR.findById(idNegocio).orElse(new Negocio());
    }

    @Override
    public List<Negocio> listByTipoNegocio(int idTipoNegocio) {
        return nR.listByTipoNegocio(idTipoNegocio);
    }

}
