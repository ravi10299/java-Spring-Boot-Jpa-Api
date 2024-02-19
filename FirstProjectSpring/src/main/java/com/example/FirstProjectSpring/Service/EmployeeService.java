//step 4.......

package com.example.FirstProjectSpring.Service;

import com.example.FirstProjectSpring.Dto.EmployeeDto;
import com.example.FirstProjectSpring.Entity.Employee;
import com.example.FirstProjectSpring.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployee(int id ){
        return employeeRepository.findById(id).get();
    }



//    public Employee addEmployee(Employee postemployee) {

//        return employeeRepository.save(postemployee);
//    }

    public Employee addEmployee(EmployeeDto employeeDto) {
        //create a object employee..
        Employee emp =new Employee();
        emp.setName(employeeDto.getName());
        emp.setAge(employeeDto.getAge());
        emp.setSalary(employeeDto.getSalary());



        return employeeRepository.save(emp);
    }

    public Employee updateEmployee(EmployeeDto employeeDto, int id) {
        Employee oldEmp = new Employee();
        oldEmp.setName(employeeDto.getName());
        oldEmp.setAge(employeeDto.getAge());
        oldEmp.setSalary(employeeDto.getSalary());
        return employeeRepository.save(oldEmp);
    }



    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "employee id deleted........."+id;
    }
}
