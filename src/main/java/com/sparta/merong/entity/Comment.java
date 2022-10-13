package com.sparta.merong.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.merong.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Member member;

    @Column(nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Blog post;


    public Comment(Member member, CommentRequestDto commentRequestDto, Blog post) {
        this.member = member;
        this.comment = commentRequestDto.getComment();
        this.post = post;
    }
}