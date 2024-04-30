package com.blogapp12.blogapp.repository;

import com.blogapp12.blogapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
