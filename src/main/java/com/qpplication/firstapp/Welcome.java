package com.qpplication.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/hello")
	public String welcome(){
		
		return "Hello World, First Application -- First Name : Hiba -- Last Name : El Kihal";
	}
	
}
