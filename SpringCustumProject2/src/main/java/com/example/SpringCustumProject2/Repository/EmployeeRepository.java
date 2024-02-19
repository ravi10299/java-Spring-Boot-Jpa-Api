package com.example.SpringCustumProject2.Repository;

import com.example.SpringCustumProject2.Entity.Employee;
import com.example.SpringCustumProject2.Entity.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Student findByEmail(String email);
}
