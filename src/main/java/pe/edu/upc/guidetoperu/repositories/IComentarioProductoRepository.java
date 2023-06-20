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
    @Query("FROM ComentarioProducto cp WHERE cp.cliente.id = :idcliente")
    List<ComentarioProducto> listByCliente(@Param("idcliente") int idcliente);
    @Query("FROM ComentarioProducto cp WHERE cp.producto.idproducto = :idproducto")
    List<ComentarioProducto> listByProducto(@Param("idproducto") int idproducto);
    @Query("FROM ComentarioProducto cp WHERE cp.cliente.id = :idcliente AND cp.producto.idproducto = :idproducto")
    List<ComentarioProducto> listByClienteProducto(@Param("idcliente") int idcliente, @Param("idproducto") int idproducto);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioProducto cp WHERE cp.cliente.id = :idcliente")
    void deleteByCliente(@Param("idcliente") int idcliente);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioProducto cp WHERE cp.producto.idproducto = :idproducto")
    void deleteByProducto(@Param("idproducto") int idproducto);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioProducto cp WHERE cp.cliente.id = :idcliente AND cp.producto.idproducto = :idproducto")
    void deleteByClienteProducto(@Param("idcliente") int idcliente, @Param("idproducto") int idproducto);
}
