package pe.edu.upc.negocio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.negocio.entities.Negocio;
@Repository

public interface INegocioRepository extends JpaRepository<Negocio,Integer> {

}
