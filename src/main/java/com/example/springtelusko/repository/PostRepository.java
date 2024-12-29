package com.example.springtelusko.repository;

import com.example.springtelusko.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {



}
