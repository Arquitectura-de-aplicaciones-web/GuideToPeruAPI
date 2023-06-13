package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.ComentarioProducto;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IComentarioProductoRepository extends JpaRepository<ComentarioProducto, Integer> {
    @Query("FROM ComentarioProducto cp WHERE cp.cliente.idCliente = :idCliente")
    List<ComentarioProducto> listByCliente(@Param("idCliente") int idCliente);
    @Query("FROM ComentarioProducto cp WHERE cp.producto.idProducto = :idProducto")
    List<ComentarioProducto> listByProducto(@Param("idProducto") int idProducto);
    @Query("FROM ComentarioProducto cp WHERE cp.cliente.idCliente = :idCliente AND cp.producto.idProducto = :idProducto")
    List<ComentarioProducto> listByClienteProducto(@Param("idCliente") int idCliente, @Param("idProducto") int idProducto);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioProducto cp WHERE cp.cliente.idCliente = :idCliente")
    void deleteByCliente(@Param("idCliente") int idCliente);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioProducto cp WHERE cp.producto.idProducto = :idProducto")
    void deleteByProducto(@Param("idProducto") int idProducto);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioProducto cp WHERE cp.cliente.idCliente = :idCliente AND cp.producto.idProducto = :idProducto")
    void deleteByClienteProducto(@Param("idCliente") int idCliente, @Param("idProducto") int idProducto);
}
