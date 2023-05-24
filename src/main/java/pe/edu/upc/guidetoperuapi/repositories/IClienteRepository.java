package pe.edu.upc.guidetoperuapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperuapi.entities.Cliente;

@Repository


public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
}
