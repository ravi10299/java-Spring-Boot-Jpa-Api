//step 3....



package com.example.FirstProjectSpring.Controler;

import com.example.FirstProjectSpring.Dto.EmployeeDto;
import com.example.FirstProjectSpring.Service.EmployeeService;
import com.example.FirstProjectSpring.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
@Autowired
EmployeeService employeeService;


    //Get.......multiple value......
    @GetMapping("api/Employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    //Get the single value.......
    @GetMapping("api/Employee/{id}")
    private Employee getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    //Post(insert)..............using by the Entity class.....

//    @PostMapping("api/Employee")
//    public Employee addEmployee(@RequestBody Employee postemployee){
//        return employeeService.addEmployee(postemployee);
//
//    }



    //use by the Dto................
    @PostMapping("api/Employee")
    public Employee addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);

    }

    //put(update)..........
    @PutMapping("api/Employee/{id}")
    public Employee updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable int id){
        return employeeService.updateEmployee(employeeDto,id);
    }



    //Delete...............
    @DeleteMapping("api/Employee/{id}")
    public String deleteEmployee(@PathVariable int id){
        return  employeeService.deleteEmployee(id);
    }



}
