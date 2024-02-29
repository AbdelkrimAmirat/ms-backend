package fr.atapi.abdelkrim.msbackend.repository;

import fr.atapi.abdelkrim.msbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}


