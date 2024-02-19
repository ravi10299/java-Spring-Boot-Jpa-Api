package com.example.SpringCustumProject2.Services;

import com.example.SpringCustumProject2.Entity.Employee;
import com.example.SpringCustumProject2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    public Employee getEmployeeID( int id){
        return employeeRepository.findById(id).get();

    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
