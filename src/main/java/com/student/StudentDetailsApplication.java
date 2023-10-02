package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.student.repository")

public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}

}
