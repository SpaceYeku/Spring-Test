package com.example.demo;

import org.springframework.boot.SpringApplication;

public class HelloWorld {
	private String message;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);	
		HelloWorld obj = new HelloWorld();
		
		obj.setMessage("Ciao!");
		obj.getMessage();
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage() {
		System.out.println("TEST: -" + message);
	}
}
