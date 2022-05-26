package com.redknight.memorytrainer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public String addUser(@RequestParam String userName, @RequestParam String pwd) {
        User user = new User();
        user.setUserName(userName);
        user.setPwd(pwd);
        userRepository.save(user);
        return "Added new user to repo!";
    }

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getUserByUserId/{userId}")
    public User getUserByUserId(@PathVariable Integer userId) {
        return userRepository.getUserByUserId(userId);
    }
}