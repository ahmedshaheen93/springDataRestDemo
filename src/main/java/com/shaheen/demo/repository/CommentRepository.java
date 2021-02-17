package com.shaheen.demo.repository;

import com.shaheen.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "comments")
public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
