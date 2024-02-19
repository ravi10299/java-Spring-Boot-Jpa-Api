package com.example.CustumApplication.Repository;

import com.example.CustumApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {

        //for Custom query Method......

   // public Employee findByName(String empName);
   public Employee findBySalary(double salary);




}
