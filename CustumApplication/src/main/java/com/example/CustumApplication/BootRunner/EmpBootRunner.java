package com.example.CustumApplication.BootRunner;

import com.example.CustumApplication.Entity.Employee;
import com.example.CustumApplication.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpBootRunner implements CommandLineRunner {
    @Autowired
    EmpRepository empRepository;

    @Override
    public void run(String... args) throws Exception {

        //Data 1......
        Employee emp = new Employee();
        emp.setEmpName("ravi");
        emp.setSalary(52000);
        emp.setPassword("rkv@1234");
        empRepository.save(emp);

        //Data2...
 //             Employee emp1 = new Employee();
//        emp1.setEmpName("shashi shekhar azad");
//        emp1.setSalary(45000);
//        emp1.setPassword("shashi@1234");
//        empRepository.save(emp1);
//
//
//        // data3.....
//        Employee emp2 = new Employee();
//        emp2.setEmpName("ravindra shekhar azad");
//        emp2.setSalary(44000);
//        emp2.setPassword("ravindra@1234");
//        empRepository.save(emp2);





        //to find the records by using pre-defined methods.

        // To Find single record by Id.................
      //  System.out.println(empRepository.findById(2).get());

        // To check record exist or not..................
//        boolean status1 = empRepository.existsById(2);
//        System.out.println(status1);

//        // To Find all of records......
//        empRepository.findAll().forEach(System.out::println);
//
//        // To Find Multiple Records of records.....
//        empRepository.findAllById(List.of(2,3)).forEach(System.out::println);
//
//
//        // To Find count of records.....
//        long count = empRepository.count();
//        System.out.println(count);

//        // To delete record by using id.....
//        empRepository.deleteById(3);
//
//        // To Delete by using object......
//        empRepository.delete(emp1);
//
//        // To delete all records........
//        empRepository.deleteAll();
//
//        // To delete multiple records by using id.....
//
//        empRepository.deleteAllById(List.of(3,4));



        //for Custom query Method...
//
//    empRepository.findByName("ravi kumar verma"));
     Employee e = empRepository.findBySalary(45000);
        System.out.println(e);


    }



}
