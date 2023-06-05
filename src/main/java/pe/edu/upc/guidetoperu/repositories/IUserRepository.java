package pe.edu.upc.guidetoperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.guidetoperu.entities.User;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query("FROM User u WHERE u.email = :email")
    List<User> searchEmail(@Param("email") String email);

    @Query("FROM User u WHERE u.username LIKE :user_name%")
    List<User> searchUsernameStartWith(@Param("user_name") String user_name);
}
