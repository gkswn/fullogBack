package com.example.fullogback.domain.post.entity;

import com.example.fullogback.custom.entity.BaseEntity;
import com.example.fullogback.domain.image.Entity.ImageEntity;
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

    @Column
    private String title;
    @Column
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ImageEntity> images = new ArrayList<>();

}
