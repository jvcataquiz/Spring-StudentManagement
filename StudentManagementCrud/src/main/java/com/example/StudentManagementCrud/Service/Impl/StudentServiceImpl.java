package com.example.StudentManagementCrud.Service.Impl;

import com.example.StudentManagementCrud.Entity.Student;
import com.example.StudentManagementCrud.Repository.StudentRepository;
import com.example.StudentManagementCrud.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveNewStudent(Student student) {
        return studentRepository.save(student);
    }


}
