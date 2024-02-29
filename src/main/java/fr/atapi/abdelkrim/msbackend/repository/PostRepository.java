package fr.atapi.abdelkrim.msbackend.repository;

import fr.atapi.abdelkrim.msbackend.models.Post;
import fr.atapi.abdelkrim.msbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findByUserId(Integer id);

}


