package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {

}
