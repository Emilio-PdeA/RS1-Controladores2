package com.example.RS1;

import com.example.RS1.models.Persona;
import com.example.RS1.services.ControllerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Rs1ControladoresAvanzadoApplication {

	public static final String PURPLE = "\033[0;35m";  // PURPLE
	public static final String WHITE = "\033[0;37m";   // WHITE

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Rs1ControladoresAvanzadoApplication.class, args);

		System.out.println(PURPLE + "\t\tINICIAR PROGRAMA" + WHITE);

		ControllerService controllerService = context.getBean(ControllerService.class);
		controllerService.addPersona(new Persona("Emilio","San Sebastian",24));
		controllerService.addPersona(new Persona("Alicia","Pamplona",21));


	}

}
