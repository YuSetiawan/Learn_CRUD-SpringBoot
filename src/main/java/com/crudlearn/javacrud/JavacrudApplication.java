package com.crudlearn.javacrud;

import com.crudlearn.javacrud.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class JavacrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavacrudApplication.class, args);
	}

	@GetMapping
	public List<User> hello() {
		return List.of(
				new User(
						1L,
						"Yusuf",
						"yusuf@example.com",
						LocalDate.of(2023, Month.AUGUST, 23)
				)
		);
	}
}
