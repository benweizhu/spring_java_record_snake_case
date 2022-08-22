package com.example.snake_case;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping(value = "/users")
    public User createUser(@RequestBody User user) {
        return user;
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return new User("firstName", "lastName", new Organization("firstName"));
    }
}
