package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class StudentDto {
    private String name;
    private UUID studentId;
    private String lastName;
    private UUID groupId;
}
