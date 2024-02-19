package com.example.SpringProject3.Services;

import com.example.SpringProject3.Dto.EmployeeDto;
import com.example.SpringProject3.Entity.Employee;
import com.example.SpringProject3.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    EmpRepository empRepository;


    public List<Employee> EmployeeData() {
        return empRepository.findAll();
    }


    public Employee AddnewEmployee(EmployeeDto employeeDto) {
        //create a object employee..
        Employee emp = new Employee();
        emp.setName(employeeDto.getName());
        emp.setSalary(employeeDto.getSalary());
        return empRepository.save(emp);

    }
}
