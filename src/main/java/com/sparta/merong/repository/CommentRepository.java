package com.sparta.merong.repository;



import com.sparta.merong.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostId(Long postId);
    Optional<Comment> findByMember_Id(Long memberId);

    void deleteAllByPostId(Long postId);
}