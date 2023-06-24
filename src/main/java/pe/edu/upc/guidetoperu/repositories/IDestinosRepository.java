package pe.edu.upc.guidetoperu.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Destinos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface IDestinosRepository extends JpaRepository<Destinos,Integer> {

    @Query(value = "SELECT departarmento, COUNT(*) FROM destinos " +
            "GROUP BY departarmento " +
            "ORDER BY COUNT(*) DESC", nativeQuery = true)
    List<Object[]> departamentosMasVisitados();

    @Query(value = "SELECT distrito, COUNT(*) FROM destinos " +
            "GROUP BY distrito " +
            "ORDER BY COUNT(*) DESC", nativeQuery = true)
    List<Object[]> distritosMasVisitados();
}

