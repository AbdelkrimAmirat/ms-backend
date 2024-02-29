package fr.atapi.abdelkrim.msbackend.service;

import fr.atapi.abdelkrim.msbackend.models.Post;
import fr.atapi.abdelkrim.msbackend.models.User;
import fr.atapi.abdelkrim.msbackend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getPostsByUserId(Integer id){
        return postRepository.findByUserId(id);
    }

    public Post savePost(Post post){
        return postRepository.save(post);
    }

}

