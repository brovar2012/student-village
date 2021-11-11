package com.example.demo.controller;

import com.example.demo.controller.convertor.StudentConvertor;
import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path = "${v1API}/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getAllStudents(@Parameter Integer offset, @Parameter Integer limit) {
        return StreamSupport.stream(studentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @PostMapping
    public Student addStudent(@RequestBody StudentDto studentDto) {
        return studentRepository.save(StudentConvertor.convertFromDto(studentDto));
    }
}
