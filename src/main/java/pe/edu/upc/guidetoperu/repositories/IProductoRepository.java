package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

    @Query(value = "SELECT p.nombre AS nombre_producto, cp.comentario " +
            "FROM productos p, comentario_productos cp " +
            "WHERE p.idproducto = cp.id_producto", nativeQuery = true)

      List<String[]> getProductosConComentarios();


    @Query(value="Select v.nombre from productos v where v.calificacion = 5", nativeQuery = true)
    List<String[]> findProductosMejorCalificados();


}
