package com.example.StudentManagementCrud.Repository;

import com.example.StudentManagementCrud.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
