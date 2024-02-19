package com.example.SpringCustumProject2.Controller;
import com.example.SpringCustumProject2.Entity.Employee;
import com.example.SpringCustumProject2.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("api/Employee")
    public List<Employee> getEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("api/Employee/{id}")
    public Employee getEmployeeId(@PathVariable int id){
        return employeeService.getEmployeeID(id);
    }
    @PostMapping("Employee")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
