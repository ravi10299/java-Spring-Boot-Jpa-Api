package com.example.SpringCustumProject2.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Student_info")
@Data
public class Student {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String name;
    @Column(length = 10)
    private String mobileNo;
    @Column(length = 1)
    private String gender;
    @Column(length = 10)
    private int age;
    @Column(length = 30)
    private String college;
    @Column(length = 30)
    private String email;
    @Column(length = 50)
    private String address;
}
