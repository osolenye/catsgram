package ru.yandex.practicum.catsgram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.service.PostService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    private final PostService postService;

    // tells Spring IoC that this is a Dependency Injection
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> findAll() {
        return postService.findall();
    }

    @PostMapping("/posts")
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }

    // REST rules say that id should be in the URL - it is called path variable
    @GetMapping("/posts/{postId}")
    public Optional<Post> findById(@PathVariable int postId) {
        return postService.findById(postId);
    }

    // /posts?user=user123 is a request parameter in a url
    @GetMapping("/posts/search")
    public List<Post> searchPosts(@RequestParam String author) {
        System.out.println("searching for the name " + author);
        return null;
    }
}
