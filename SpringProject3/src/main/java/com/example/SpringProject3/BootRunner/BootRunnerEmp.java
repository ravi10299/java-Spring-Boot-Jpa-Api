//package com.example.SpringProject3.BootRunner;
//
//import com.example.SpringProject3.Repository.EmpRepository;
//import com.example.SpringProject3.Entity.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BootRunnerEmp implements CommandLineRunner {
//    @Autowired
//    EmpRepository empRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        //create the object of Employee(Entity class)
//        Employee e = new Employee();
//        e.setName("ravi");
//        e.setSalary(25000.2);
//        empRepository.save(e);
//
//    }
//}
