package com.pmt.courseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmt.courseapi.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
