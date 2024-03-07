package fr.atapi.abdelkrim.msbackend.service;

import fr.atapi.abdelkrim.msbackend.models.Post;
import fr.atapi.abdelkrim.msbackend.models.PostDTO;
import fr.atapi.abdelkrim.msbackend.models.User;
import fr.atapi.abdelkrim.msbackend.repository.PostRepository;
import fr.atapi.abdelkrim.msbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Post> getPostsByUserId(Integer id){
        return postRepository.findByUserId(id);
    }

    public Post savePost(PostDTO postDto){

        Post post=new Post();

        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());

        User user = userRepository.findById(postDto.getUserId()).orElse(null);
        if (user != null) {
            post.setUser(user);
            return postRepository.save(post);
        }
        return null;

    }

    public List<Post> getAllPosts(){ return postRepository.findAll();
    }

    public void deletePostById(Integer id) {
        postRepository.deleteById(id);
    }
}
