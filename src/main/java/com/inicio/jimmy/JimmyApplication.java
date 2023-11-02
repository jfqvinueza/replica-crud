package com.inicio.jimmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class JimmyApplication {

	@GetMapping("/users")
	public String listUsers() {
		// Código para mostrar la lista de usuarios
		return "users";
	}

	@PostMapping("/users")
	public String createUser() {
		// Código para crear un usuario
		return "redirect:/users";
	}

	public static void main(String[] args) {
		SpringApplication.run(JimmyApplication.class, args);
	}

}
