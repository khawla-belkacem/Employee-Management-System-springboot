package com.example.student;

import com.example.student.Entity.Student;
import com.example.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

/*
     Student student1 = new Student("khawla","ben kacem","Khawla@gmail.com");
     studentRepository.save(student1);

    Student student2= new Student("khalil","ben kacem","Khalil@gmail.com");
    studentRepository.save(student2);

    Student student3= new Student("youssef","ben kacem","youssef@gmail.com");
    studentRepository.save(student3);
        Student student4= new Student("yassine","ben kacem","yassine@gmail.com");
        studentRepository.save(student4);*/
 }


}
