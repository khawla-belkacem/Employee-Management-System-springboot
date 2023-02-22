package com.example.student.Service;

import com.example.student.Entity.Student;

import java.util.List;

public interface Studentservice {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
