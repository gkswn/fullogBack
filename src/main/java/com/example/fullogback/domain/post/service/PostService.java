package com.example.fullogback.domain.post.service;

import com.example.fullogback.domain.post.dto.PostContent;
import com.example.fullogback.domain.post.entity.PostEntity;
import com.example.fullogback.domain.post.exception.PostException;
import com.example.fullogback.domain.post.repository.PostRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
	private final PostRepository postRepository;

	public void upload(PostContent postContent, String author) {
		postRepository.save(postContent.toEntity());
	}

	public PostContent detailArticle(String postNumber) {

		PostEntity postEntity =  postRepository.findById(postNumber)
			.orElseThrow(() -> new PostException("게시글을 찾을 수 없습니다"));

		return postEntity.fromEntity();
	}
}
