package com.smomar.SpringBootCrud.service;


import com.smomar.SpringBootCrud.bean.Student;
import com.smomar.SpringBootCrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepo;


    public List<Student> getAllStudents(){

        List<Student> students = new ArrayList<>();
        studentRepo.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student) {

        studentRepo.save(student);
    }

    public void updateStudent(Student student) {

        studentRepo.save(student);
    }

    public void deleteStudent(Long id) {

        studentRepo.deleteById(id);
    }
}
