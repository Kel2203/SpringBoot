package com.learnjava.Aula.SpringBoot;

import com.learnjava.entities.Employee;
import com.learnjava.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.learnjava"})
@SpringBootApplication
public class AulaSpringBootApplication implements CommandLineRunner {
//teste git
	@Autowired
 private SalaryService salaryService;



	public static void main(String[] args) {
		SpringApplication.run(AulaSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee("Maria", 4000.0);

		System.out.println(salaryService.netSalary(employee));
	}
}
