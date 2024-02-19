//step2


//Repository method is using to create the logic of the databases....
package com.example.FirstProjectSpring.Repository;
import com.example.FirstProjectSpring.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {

}
