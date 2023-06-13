package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.TipoNegocio;
import pe.edu.upc.guidetoperu.repositories.ITipoNegocioRepository;
import pe.edu.upc.guidetoperu.services.ITipoNegocioService;

import java.util.List;

@Service
public class TipoNegocioServiceImplement implements ITipoNegocioService {
    @Autowired
    private ITipoNegocioRepository tnR;

    @Override
    public void insert(TipoNegocio tipoNegocio) {
        tnR.save(tipoNegocio);
    }

    @Override
    public List<TipoNegocio> list() {
        return tnR.findAll();
    }

    @Override
    public void delete(int idTipoNegocio) {
        tnR.deleteById(idTipoNegocio);
    }

    @Override
    public TipoNegocio listId(int idTipoNegocio) {
        return tnR.findById(idTipoNegocio).orElse(new TipoNegocio());
    }
}
