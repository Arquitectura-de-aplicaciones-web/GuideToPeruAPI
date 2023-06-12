package pe.edu.upc.guidetoperu.services;
import pe.edu.upc.guidetoperu.entities.Cliente;
import java.util.List;
public interface IClienteService {

    public void insert(Cliente cliente);
    List<Cliente> list();
    public void delete(int id);
    public Cliente listID (int id);

}
