package pe.edu.upc.guidetoperu.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.guidetoperu.entities.Cliente;
import pe.edu.upc.guidetoperu.repositories.IClienteRepository;
import pe.edu.upc.guidetoperu.services.IClienteService;

import java.util.List;

@Service
public class ClienteServiceImplement implements IClienteService {
    @Autowired
    private IClienteRepository cR;

    @Override
    public void insert(Cliente cliente){cR.save(cliente);}
    @Override
    public List<Cliente> list(){return cR.findAll();}

    @Override
    public void delete(int id){
        cR.deleteById(id);
    }

    @Override
    public Cliente listID (int id){
        return cR.findById(id).orElse(new Cliente());
    }



}
