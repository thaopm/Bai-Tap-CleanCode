package com.pmt.postmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmt.postmanagement.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
