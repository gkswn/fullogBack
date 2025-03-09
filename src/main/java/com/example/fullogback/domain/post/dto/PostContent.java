package com.example.fullogback.domain.post.dto;

import com.example.fullogback.domain.post.entity.PostEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PostContent {
    private String title;
    private String content;
    private String authorNickname;

    public PostEntity toEntity() {
        return PostEntity.builder()
                .id(UUID.randomUUID().toString())
                .title(this.title)
                .content(this.content)
                .authorName(this.authorNickname)
                .build();
    }
}
