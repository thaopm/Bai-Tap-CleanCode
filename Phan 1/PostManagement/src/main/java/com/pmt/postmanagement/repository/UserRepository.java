package com.pmt.postmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmt.postmanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
