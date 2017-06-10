package com.dh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
//	@RequestMapping("/")
//	String hello(){
//		return "Hello";
//	}
//	@RequestMapping("/{person}")
//	String helloPerson(@PathVariable String person){
//		return "Hello "+person;
//	}
//	@RequestMapping("/{person}/edad/{edad}")
//	String helloPersonEdad(@PathVariable String person,@PathVariable int edad){
//		return "Hello "+person+" tienes "+edad+" anios";
//	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
