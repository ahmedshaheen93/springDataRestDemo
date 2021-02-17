package com.shaheen.demo.repository;

import com.shaheen.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "posts")
public interface PostRepository extends JpaRepository<Post,Integer> {

    List<Post> findByValue(@Param("value")String value);
}
