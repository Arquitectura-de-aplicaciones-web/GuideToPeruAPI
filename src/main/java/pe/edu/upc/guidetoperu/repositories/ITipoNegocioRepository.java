package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.TipoNegocio;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITipoNegocioRepository extends JpaRepository<TipoNegocio, Integer> {
    @Query("from TipoNegocio b where b.idTipoNegocio=:tipo")
    List<TipoNegocio> buscarTipo(@Param("tipo") LocalDate tipo);
}
