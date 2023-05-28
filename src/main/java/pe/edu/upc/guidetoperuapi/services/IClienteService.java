package pe.edu.upc.guidetoperuapi.services;
import pe.edu.upc.guidetoperuapi.entities.Cliente;
import java.util.List;
public interface IClienteService {

    public void insert(Cliente cliente);
    List<Cliente> list();
    public void delete(int idCliente);
    public Cliente listID (int idCliente);

}
