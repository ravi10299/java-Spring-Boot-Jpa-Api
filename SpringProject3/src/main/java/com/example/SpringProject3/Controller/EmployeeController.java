package com.example.SpringProject3.Controller;

import com.example.SpringProject3.Dto.EmployeeDto;
import com.example.SpringProject3.Entity.Employee;
import com.example.SpringProject3.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServices employeeServices;
    @GetMapping("showAllEmployeeData")
    public List<Employee> GetEmployee(){
        return employeeServices.EmployeeData();
    }

    @PostMapping("")
    private Employee AddEmployeeData(@RequestBody EmployeeDto employeeDto){
        return employeeServices.AddnewEmployee(employeeDto);
    }

}
