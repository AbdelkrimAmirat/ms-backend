package fr.atapi.abdelkrim.msbackend.controller;
import fr.atapi.abdelkrim.msbackend.models.User;
import fr.atapi.abdelkrim.msbackend.repository.UserRepository;
import fr.atapi.abdelkrim.msbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;
    @GetMapping("get-all-users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("get-user-by-id/{toto}")
    public User getUserById(@PathVariable Integer toto) {
        return userService.getUserById(toto);
    }

    @PostMapping("save-user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
