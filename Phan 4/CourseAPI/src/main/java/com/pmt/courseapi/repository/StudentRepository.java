package com.pmt.courseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmt.courseapi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
