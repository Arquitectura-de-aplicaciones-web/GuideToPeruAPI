package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.ComentarioNegocio;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IComentarioNegocioRepository extends JpaRepository<ComentarioNegocio, Integer> {
    @Query("FROM ComentarioNegocio cn WHERE cn.cliente.id = :idCliente")
    List<ComentarioNegocio> listByCliente(@Param("idCliente") int idCliente);
    @Query("FROM ComentarioNegocio cn WHERE cn.negocio.id = :idNegocio")
    List<ComentarioNegocio> listByNegocio(@Param("idNegocio") int idNegocio);
    @Query("FROM ComentarioNegocio cn WHERE cn.cliente.id = :idCliente AND cn.negocio.id = :idNegocio")
    List<ComentarioNegocio> listByClienteNegocio(@Param("idCliente") int idCliente, @Param("idNegocio") int idNegocio);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioNegocio cn WHERE cn.cliente.id = :idCliente")
    void deleteByCliente(@Param("idCliente") int idCliente);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioNegocio cn WHERE cn.negocio.id = :idNegocio")
    void deleteByNegocio(@Param("idNegocio") int idNegocio);
    @Transactional
    @Modifying
    @Query("DELETE FROM ComentarioNegocio cn WHERE cn.cliente.id = :idCliente AND cn.negocio.id = :idNegocio")
    void deleteByClienteNegocio(@Param("idCliente") int idCliente, @Param("idNegocio") int idNegocio);
}
