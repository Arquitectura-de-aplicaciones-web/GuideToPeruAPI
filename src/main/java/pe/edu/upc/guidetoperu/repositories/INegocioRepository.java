package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Negocio;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface INegocioRepository extends JpaRepository<Negocio,Integer> {

    @Query(value="Select v.name_negocio from negocios v where v.calificacion = 5", nativeQuery = true)
    List<String[]> findNegociosMejorCalificados();



}
