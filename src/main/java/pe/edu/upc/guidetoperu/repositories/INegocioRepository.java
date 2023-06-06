package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Negocio;
@Repository

public interface INegocioRepository extends JpaRepository<Negocio,Integer> {

}