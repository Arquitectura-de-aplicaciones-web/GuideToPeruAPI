package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.guidetoperu.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String Username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.Username) from Usuario u where u.Username =:Username")
    public int buscarUsername(@Param("Username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, usuario_id) VALUES (:rol, :usuario_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("usuario_id") int usuario_id);


}
