package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Compra;

import java.util.List;

@Repository
public interface ICompraRepository extends JpaRepository<Compra, Integer> {


    @Query(value = "SELECT a.nombre,count(b.id_compra) from compras b \n" +
            "join productos a on  b.id_producto = a.idproducto \n" +
            "group by a.nombre ORDER BY COUNT(a.nombre) DESC", nativeQuery = true)
    List<String[]> productosmascomprados();

    @Query(value = "SELECT a.name_cliente,count(b.id_compra) from compras b \n" +
            "join clientes a on  b.id_cliente = a.id \n" +
            "group by a.name_cliente ORDER BY COUNT(a.name_cliente) DESC", nativeQuery = true)
    List<String[]> clientescompras();

}
