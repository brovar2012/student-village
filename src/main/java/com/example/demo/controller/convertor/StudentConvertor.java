package com.example.demo.controller.convertor;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StudentConvertor {

    public static Student convertFromDto(StudentDto studentDto) {
        return Student.builder()
                .studentId(studentDto.getStudentId())
                .lastName(studentDto.getLastName())
                .name(studentDto.getName())
                .build();
    }
}
