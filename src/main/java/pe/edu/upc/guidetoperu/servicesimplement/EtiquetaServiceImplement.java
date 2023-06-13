package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Etiqueta;
import pe.edu.upc.guidetoperu.repositories.IEtiquetaRepository;
import pe.edu.upc.guidetoperu.services.IEtiquetaService;

import java.util.List;

@Service
public class EtiquetaServiceImplement implements IEtiquetaService {
    @Autowired
    private IEtiquetaRepository eR;

    @Override
    public void insert(Etiqueta etiqueta) {
        eR.save(etiqueta);
    }

    @Override
    public List<Etiqueta> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEtiqueta) {
        eR.deleteById(idEtiqueta);
    }

    @Override
    public Etiqueta listId(int idEtiqueta) {
        return eR.findById(idEtiqueta).orElse(new Etiqueta());
    }
}
