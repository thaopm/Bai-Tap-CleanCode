package com.pmt.postmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmt.postmanagement.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	@Override
	default <S extends Post> S save(S entity) {
		return null;
	}
}

