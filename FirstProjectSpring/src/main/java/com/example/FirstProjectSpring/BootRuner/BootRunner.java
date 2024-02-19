//package com.example.FirstProjectSpring;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class BootRunner implements CommandLineRunner {
//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Employee s = new Employee();
//        s.setName("Azad");
//        s.setAge(21);
//        s.setSalary(2500.2);
//
//
//
//        Employee s1 = new Employee();
//        s1.setName("Azad");
//        s1.setAge(21);
//        s1.setSalary(2500.2);
//
//
//        employeeRepository.saveAll(List.of(s,s1));
//
//    }
//}
