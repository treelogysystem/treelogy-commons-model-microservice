package br.treelogy.modelmicroservice.repositories;

import br.treelogy.modelmicroservice.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Query("SELECT u FROM UserModel u WHERE u.id = ?1")
    UserModel getUserById(Long id);
}
