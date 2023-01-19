package com.smomar.SpringBootCrud.controller;


import com.smomar.SpringBootCrud.bean.Student;
import com.smomar.SpringBootCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    //find students
    @RequestMapping("/students")
    public List<Student> getAllStudents(){
      return studentService.getAllStudents();
    }


    //add student
    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student)
    {

       studentService.addStudent(student);
    }

    //update student
    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student)
    {
        studentService.updateStudent(student);
    }

    //delete student
    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
    }

}
