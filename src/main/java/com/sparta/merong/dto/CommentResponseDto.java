package com.sparta.merong.dto;

import com.sparta.merong.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CommentResponseDto {
    private String userName;

    private String comment;

    public CommentResponseDto(Comment comment) {
        this.userName = comment.getMember().getEmail();
        this.comment = comment.getComment();
    }
}