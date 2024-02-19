package com.example.FirstProjectSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectSpringApplication {

	public static void main(String[] args) {
		 SpringApplication.run(FirstProjectSpringApplication.class, args);
//		EmployeeRepository employeeRepository = ac.getBean("employeeRepository",EmployeeRepository.class);
//		Employee e = new Employee();
//		e.setName("sudesh");
//		e.setAge(24);
//		e.setSalary(250000);
//		employeeRepository.save(e);

	}

}
