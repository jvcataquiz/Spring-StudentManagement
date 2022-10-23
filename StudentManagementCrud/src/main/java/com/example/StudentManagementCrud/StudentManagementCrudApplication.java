package com.example.StudentManagementCrud;


import com.example.StudentManagementCrud.Entity.Student;
import com.example.StudentManagementCrud.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementCrudApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Jv", "Cataquiz", "jvcataquiz@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Jose", "Martin", "josemartin@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Maria", "DeLa Crus", "mariadelacrus@gmail.com");
//		studentRepository.save(student3);
	}
}
