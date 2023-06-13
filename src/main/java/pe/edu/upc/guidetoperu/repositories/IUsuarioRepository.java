package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("FROM Usuario u WHERE u.correo = :correo")
    List<Usuario> searchEmail(@Param("correo") String correo);

    @Query("FROM Usuario u WHERE u.nombreUsuario LIKE :nombreUsuario%")
    List<Usuario> searchUsernameStartWith(@Param("nombreUsuario") String nombreUsuario);

}
