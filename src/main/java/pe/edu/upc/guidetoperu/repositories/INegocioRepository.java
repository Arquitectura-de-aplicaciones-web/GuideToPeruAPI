package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Negocio;

import java.util.List;

@Repository

public interface INegocioRepository extends JpaRepository<Negocio,Integer> {
    @Query("FROM Negocio n where n.tipoNegocio.idTipoNegocio = :idTipoNegocio")
    List<Negocio> listByTipoNegocio(@Param("idTipoNegocio") int idTipoNegocio);
}
