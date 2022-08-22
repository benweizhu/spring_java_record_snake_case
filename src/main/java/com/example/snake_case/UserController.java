package com.example.snake_case;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping(value = "/users")
    public User createUser(@RequestBody User user) {
        return user;
    }
}
