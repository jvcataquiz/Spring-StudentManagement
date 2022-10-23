package com.example.StudentManagementCrud.Service;

import com.example.StudentManagementCrud.Entity.Student;

import java.util.List;

public interface StudentService {
    //view all the data in the database
    List<Student> getAllStudents();
    // insert new data to the database
    Student saveNewStudent(Student student);
    //getting data by the specific Id
    Student getStudentById(Long id);
    //save updated value in the database
    Student updateStudent(Student student);

    //deletion
    void deleteStudentRecord(Long id);
}

