package com.example.fullogback.domain.post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullogback.domain.member.entity.MemberEntity;
import com.example.fullogback.domain.post.dto.PostContent;
import com.example.fullogback.domain.post.service.PostService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@PostMapping("/postUpload")
	public ResponseEntity<Void> postUpload(
		@RequestBody PostContent postContent,
		HttpSession httpSession
	) {
		MemberEntity memberEntity = (MemberEntity)httpSession.getAttribute("memberEntity");
		String author = memberEntity.getNickName();

		postService.upload(postContent, author);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/detailArticle")
	public ResponseEntity<PostContent> detailArticle(
		@RequestParam String postNumber
	) {

		PostContent postContent = postService.detailArticle(postNumber);
		return ResponseEntity.ok(postContent);
	}

}
