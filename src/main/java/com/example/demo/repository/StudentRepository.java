package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface StudentRepository extends CrudRepository<Student, UUID> {

    List<Student> findByLastName(String lastName);

    Student findStudentsByStudentId(UUID id);
}
