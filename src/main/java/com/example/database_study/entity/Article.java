package com.example.database_study.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Setter
@Getter
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(unique=true, nullable=false)
    @NonNull
    private String title;
    @Column(nullable=false)
    @NonNull
    @NotBlank
    private String writer;
    @Lob
    @NonNull
    private String content;
    // mappedBy를 이용하여 외래키 관계 생성
    @OneToMany(mappedBy="article",
            fetch=FetchType.LAZY, //LAZY는 article을 가져오는 시점 자체에는 데이터를 가져오는 것이 아니라, 게터 메서드를 호출, 즉 접근하는 시점에 데이터 불러옴
            cascade=CascadeType.ALL,
            orphanRemoval=true)
    private List<Comment> comments = new ArrayList<>();
}

