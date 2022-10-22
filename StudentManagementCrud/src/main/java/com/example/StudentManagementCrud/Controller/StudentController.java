package com.example.StudentManagementCrud.Controller;

import com.example.StudentManagementCrud.Service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
//handler method to handle list and return model and view

}
