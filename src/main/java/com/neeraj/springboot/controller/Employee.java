package com.neeraj.springboot.controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Employee")
@Entity(name = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;
}
