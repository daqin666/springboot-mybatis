package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {  //Student是多的一方
    private Integer sid;
    private String sname;
    private Classroom classroom;  //classroom是一的一方
}
