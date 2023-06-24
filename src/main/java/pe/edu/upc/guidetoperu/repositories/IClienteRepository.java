package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Cliente;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {



}
