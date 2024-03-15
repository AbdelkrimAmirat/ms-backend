package fr.atapi.abdelkrim.msbackend.controller;

import fr.atapi.abdelkrim.msbackend.models.Post;
import fr.atapi.abdelkrim.msbackend.models.PostDTO;
import fr.atapi.abdelkrim.msbackend.models.User;
import fr.atapi.abdelkrim.msbackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("save-post")
    public Post savePost(@RequestBody PostDTO postDto) {
        System.out.println(postDto);
        return postService.savePost(postDto);
    }

    @GetMapping("get-all-posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("get-posts-by-user-id/{userId}")
    public List<Post> getPostsByUserId(@PathVariable Integer userId){
        return postService.getPostsByUserId(userId);
    }

    @PostMapping("delete-post-by-id/{id}")
    public void deletePostById(@PathVariable Integer id) {
        postService.deletePostById(id);
    }

    @GetMapping("get-post-by-id/{postId}")
    public Post getPostById(@PathVariable Integer postId){
        return postService.getPostById(postId);
    }

}
