package com.example.springtelusko.repository;

import com.example.springtelusko.model.Post;

import java.util.List;

public interface SearchRepository {
   List<Post> findByText(String text);


}
