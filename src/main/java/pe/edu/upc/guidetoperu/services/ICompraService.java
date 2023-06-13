package pe.edu.upc.guidetoperu.services;

import pe.edu.upc.guidetoperu.entities.Compra;

import java.util.List;

public interface ICompraService {
    public void insert(Compra compra);
    List<Compra> list();
    public void delete(int idCompra);
    public Compra listId(int idCompra);
}
