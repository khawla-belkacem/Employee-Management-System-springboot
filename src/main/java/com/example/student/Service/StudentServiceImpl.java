package com.example.student.Service;

import com.example.student.Entity.Student;
import com.example.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements Studentservice{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
