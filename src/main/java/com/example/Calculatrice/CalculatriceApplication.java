package com.example.Calculatrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Calculatrice.services.Calculatrice;

@SpringBootApplication
public class CalculatriceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatriceApplication.class, args);
		
		Calculatrice cal= new Calculatrice();
		System.out.println("4 + 12 = " +cal.add(4, 12));
	}
	
	
	

}


