package com.example.fullogback.domain.post.entity;

import com.example.fullogback.custom.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class PostEntity extends BaseEntity {
    private String title;
    private String content;


}
