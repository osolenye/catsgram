package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistsException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private ArrayList<User> users = new ArrayList<>();

    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }
    @PostMapping("/users")
    public User create(@RequestBody User user) throws Exception {
        if (user.getEmail().equals("")) {
            throw new InvalidEmailException("email can't be empty");
        }
        for (User user1 : users) {
            if (user.getEmail().equals(user1.getEmail())) {
                throw new UserAlreadyExistsException("user already exists!");
            }
        }
        users.add(user);
        return user;
    }

//    @PutMapping("")
}
