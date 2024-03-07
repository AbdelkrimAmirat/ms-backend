package fr.atapi.abdelkrim.msbackend.service;

import fr.atapi.abdelkrim.msbackend.models.Post;
import fr.atapi.abdelkrim.msbackend.models.User;
import fr.atapi.abdelkrim.msbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostService postService;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

}