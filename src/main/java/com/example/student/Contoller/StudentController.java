package com.example.student.Contoller;
import com.example.student.Entity.Student;
import com.example.student.Service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
//@RequestMapping("/student/")
public class StudentController {
    @Autowired
    public Studentservice studentservice;

    public StudentController(Studentservice studentservice) {
        super();
        this.studentservice = studentservice;
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentservice.getAllStudents());
        return "students";
    }


    @GetMapping("/students/new")
    public String createStudentForm(Model model) {

        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentservice.saveStudent(student);
        return "redirect:/students";

    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable long id, Model model) {
        model.addAttribute("student", studentservice.getStudentById(id));
        return "edit_student";


    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

        Student existingStudent = studentservice.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstname(student.getFirstname());
        existingStudent.setLastname(student.getLastname());
        existingStudent.setEmail(student.getEmail());

        studentservice.updateStudent(existingStudent);
        return "redirect:/students";


    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentservice.deleteStudentById(id);
        return "redirect:/students";
    }}



