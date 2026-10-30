package com.example.lms.repository;

import com.example.lms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepostory extends JpaRepository<Student, Long> {
}
