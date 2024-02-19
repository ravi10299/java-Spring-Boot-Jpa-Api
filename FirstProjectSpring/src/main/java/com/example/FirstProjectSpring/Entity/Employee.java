//step1
package com.example.FirstProjectSpring.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Employee_info")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String name;
    private int age;
    private double salary;
}
