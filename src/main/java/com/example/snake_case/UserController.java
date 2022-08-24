package com.example.snake_case;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    private final ObjectMapper objectMapper;

    public UserController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PostMapping(value = "/users")
    public User createUser(@RequestBody User user) {
        return user;
    }

    @GetMapping(value = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return new User("firstName", "lastName", new Organization("firstName"));
    }

    @GetMapping(value = "/users")
    public User getUser(@RequestParam Map<String, String> map) {
        Object object = objectMapper.convertValue(map, Object.class);
        Map<String, String> newMap = objectMapper.convertValue(object, Map.class);

        return new User(newMap.get("firstName"), "lastName", new Organization("firstName"));
    }

}
