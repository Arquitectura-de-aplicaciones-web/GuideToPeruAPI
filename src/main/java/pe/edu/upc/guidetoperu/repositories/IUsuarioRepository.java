package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("FROM Usuario u WHERE u.email = :email")
    List<Usuario> searchEmail(@Param("email") String email);

    public Usuario findByUsername(String username);
    @Query("select count(u.email) from Usuario u where u.email =:email")
    public int buscarEmail(@Param("email") String email);


}
