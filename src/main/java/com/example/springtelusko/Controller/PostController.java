package com.example.springtelusko.Controller;

import com.example.springtelusko.model.Post;
import com.example.springtelusko.repository.PostRepository;
import com.example.springtelusko.repository.SearchRepository;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController

public class PostController {
    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;

    @Operation(hidden=true)
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
          response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allposts")
    public List<Post> getAllPosts(){
          return repo.findAll();
    }

    @PostMapping("/addpost")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

    @GetMapping("/allposts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
}
