package com.example.SpringCustumProject2;

import com.example.SpringCustumProject2.Entity.Employee;
import com.example.SpringCustumProject2.Entity.Student;
import com.example.SpringCustumProject2.Repository.EmployeeRepository;
import com.example.SpringCustumProject2.Repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCustumProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCustumProject2Application.class, args);

//	ApplicationContext ac=  SpringApplication.run(SpringCustumProject2Application.class, args);
//		StudentRepository studentRepository = ac.getBean("studentRepository", StudentRepository.class);
//		Student s =new Student();
//		s.setId(2);
//		s.setName("sudesh");
//		s.setCollege("sits");
//		s.setEmail("sudesh@gmail.com");
//		s.setAddress("pune");
//		studentRepository.save(s);
//		System.out.println(studentRepository.findByEmail("sudesh@gmail.com"));
//		//System.out.println(studentRepository.findByEmail("avadesh@gmail.com"));


		//Employee Data................


//		ApplicationContext ac1 = SpringApplication.run(SpringCustumProject2Application.class, args);
//		EmployeeRepository employeeRepository = ac1.getBean("employeeRepository", EmployeeRepository.class);
//		Employee emp = new Employee();
//		emp.setName("Virat kohli");
//		emp.setEmail("virat.kohli@gmail.com");
//		emp.setSalary(200000);
//		employeeRepository.save(emp);
	}

}
