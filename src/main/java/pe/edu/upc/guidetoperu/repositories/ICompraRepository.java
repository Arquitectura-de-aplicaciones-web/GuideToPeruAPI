package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Compra;

@Repository
public interface ICompraRepository extends JpaRepository<Compra, Integer> {

}
