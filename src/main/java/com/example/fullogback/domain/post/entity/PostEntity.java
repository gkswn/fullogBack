package com.example.fullogback.domain.post.entity;

import com.example.fullogback.custom.entity.BaseEntity;
import com.example.fullogback.domain.image.Entity.ImageEntity;
import com.example.fullogback.domain.post.dto.PostContent;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class PostEntity extends BaseEntity {

    @Id
    private String id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String authorName;

    public PostContent fromEntity() {
        return PostContent.builder()
            .content(content)
            .authorNickname(authorName)
            .title(title)
            .build();
    }
}
