package com.example.StudentManagementCrud.Controller;

import com.example.StudentManagementCrud.Entity.Student;
import com.example.StudentManagementCrud.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    //calling studentService to implement all the crud operation
    private StudentService studentService;
    //contructor of the StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
//handler method to handle list and return model and view

    //displaying all data records in the databse
@GetMapping("/students")
    public String listStudents(Model model){
    model.addAttribute("students",studentService.getAllStudents());
    return "students";
    }

    // route to jump to the form for new data insertion
    @GetMapping("/students/new")
    public String createStudents(Model model){
        //create student object to hold the data from the form
        Student student = new Student();
        model.addAttribute("newstudent", student);
        return "create_student";
    }
    //handle method for inserting new records to the database
    @PostMapping("/savestudents")
    public String saveStudent(@ModelAttribute("newstudent") Student student){
    studentService.saveNewStudent(student);
    return "redirect:/students";
    }

    //search a data from the databse and view it to the upadte form
@GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model){
    model.addAttribute("updatestudent", studentService.getStudentById(id));
    return "edit_student";
    }


    //Update existing data
    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("updatestudent") Student student){
       //get the id from the database
        Student updateStudentRecords = studentService.getStudentById(id);

        updateStudentRecords.setId(id);

        //set data to the database by getting the value from the form using get()
        updateStudentRecords.setFirstName(student.getFirstName());
        updateStudentRecords.setLastName(student.getLastName());
        updateStudentRecords.setEmail(student.getEmail());
        //save the updated data to the database
        studentService.updateStudent(updateStudentRecords);
        return "redirect:/students";
    }

    //deletion of a data using specific id
    @GetMapping("/delete/{id}")
     public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentRecord(id);
        return "redirect:/students";
     }

}

