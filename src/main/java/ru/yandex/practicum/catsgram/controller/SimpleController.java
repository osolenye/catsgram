package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller class that handles HTTP requests
// methods' task is to call service methods and giving the result to the client
@RestController
// base url for the whole controller
@RequestMapping("/api/v1/home")
public class SimpleController {
    // tells spring that it is a resource URL
    @GetMapping("/hello")
    public String homePage() {
        return "Котограм";
    }
}
