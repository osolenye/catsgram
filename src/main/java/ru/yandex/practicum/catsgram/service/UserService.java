package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistsException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private ArrayList<User> users = new ArrayList<>();


    public List<User> getUsers() {
        return users;
    }

    public User create(User user) throws Exception {
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

    public User putUsers(@RequestBody User user) {
        for (int i = 0; 0 < (users.size() - 1); i++) {
            if (users.get(i).equals(user)) {
                users.set(i, user);
                return user;
            }
        }
        users.add(user);
        return user;
    }
}
