package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.EtiquetaProducto;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IEtiquetaProductoRepository extends JpaRepository<EtiquetaProducto, Integer> {
    @Query("FROM EtiquetaProducto cp WHERE cp.etiqueta.idEtiqueta = :idEtiqueta")
    List<EtiquetaProducto> listByEtiqueta(@Param("idEtiqueta") int idEtiqueta);
    @Query("FROM EtiquetaProducto cp WHERE cp.producto.idproducto = :idproducto")
    List<EtiquetaProducto> listByProducto(@Param("idproducto") int idproducto);
    @Query("FROM EtiquetaProducto cp WHERE cp.etiqueta.idEtiqueta = :idEtiqueta AND cp.producto.idproducto = :idproducto")
    List<EtiquetaProducto> listByEtiquetaProducto(@Param("idEtiqueta") int idEtiqueta, @Param("idproducto") int idproducto);
    @Transactional
    @Modifying
    @Query("DELETE FROM EtiquetaProducto cp WHERE cp.etiqueta.idEtiqueta = :idEtiqueta")
    void deleteByEtiqueta(@Param("idEtiqueta") int idEtiqueta);
    @Transactional
    @Modifying
    @Query("DELETE FROM EtiquetaProducto cp WHERE cp.producto.idproducto = :idproducto")
    void deleteByProducto(@Param("idproducto") int idproducto);
    @Transactional
    @Modifying
    @Query("DELETE FROM EtiquetaProducto cp WHERE cp.etiqueta.idEtiqueta = :idEtiqueta AND cp.producto.idproducto = :idproducto")
    void deleteByEtiquetaProducto(@Param("idEtiqueta") int idEtiqueta, @Param("idproducto") int idproducto);



}
