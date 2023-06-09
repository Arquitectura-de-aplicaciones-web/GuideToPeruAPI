package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.dtos.NegociocalificadosDTO;
import pe.edu.upc.guidetoperu.entities.Negocio;
import pe.edu.upc.guidetoperu.repositories.INegocioRepository;
import pe.edu.upc.guidetoperu.services.INegocioService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NegocioServiceImplement implements INegocioService {

    @Autowired
    private INegocioRepository aR;
    @Override
    public void insert(Negocio negocio) {aR.save(negocio);}

    @Override
    public List<Negocio> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);

    }

    @Override
    public Negocio listId(int id) {
        return aR.findById(id).orElse(new Negocio());
    }

    @Override

    public List<NegociocalificadosDTO> mejorcalificados() {

        List<String[]> mejorcalificados = aR.findNegociosMejorCalificados();
        List<NegociocalificadosDTO> calificado = new ArrayList<>();

        for (String[] data : mejorcalificados) {
            NegociocalificadosDTO dto = new NegociocalificadosDTO();
            dto.setNameNegocio(data[0]);
            calificado.add(dto);
        }
        return calificado;

    }



}
