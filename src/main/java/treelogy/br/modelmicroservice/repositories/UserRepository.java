package treelogy.br.modelmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import treelogy.br.modelmicroservice.models.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Query("SELECT u FROM UserModel u WHERE u.id = ?1")
    UserModel getUserById(Long id);
}
