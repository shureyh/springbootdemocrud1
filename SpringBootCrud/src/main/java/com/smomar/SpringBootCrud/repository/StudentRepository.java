package com.smomar.SpringBootCrud.repository;

import com.smomar.SpringBootCrud.bean.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>  {

}
