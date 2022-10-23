package com.example.StudentManagementCrud.Service;

import com.example.StudentManagementCrud.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveNewStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
}

