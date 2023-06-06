package pe.edu.upc.negocio.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.negocio.entities.Negocio;
import pe.edu.upc.negocio.repositories.INegocioRepository;
import pe.edu.upc.negocio.services.INegocioService;

import java.util.List;

@Service
public class NegocioServiceImplement implements INegocioService {

    @Autowired
    private INegocioRepository aR;
    @Override
    public void insert(Negocio negocio) {aR.save(negocio);

    }

    @Override
    public List<Negocio> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idNegocio) {
        aR.deleteById(idNegocio);

    }

    @Override
    public Negocio listId(int idNegocio) {
        return aR.findById(idNegocio).orElse(new Negocio());
    }
}
