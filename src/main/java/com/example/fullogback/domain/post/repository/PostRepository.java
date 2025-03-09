package com.example.fullogback.domain.post.repository;

import com.example.fullogback.domain.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, String> {
}
