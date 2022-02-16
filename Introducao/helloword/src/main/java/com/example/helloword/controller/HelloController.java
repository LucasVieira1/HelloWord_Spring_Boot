
package com.example.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/hello")   //tudo oq puxar com /hello vai abrir aqui, oq vou ter que pesquisar, no caso "hello"
public class HelloController {

	@GetMapping
	public String getHello() {
		return "Hello Word!!!";
	}
	@GetMapping ("/turma44") //coloca dps do /hello
	public String getHello2() {
		return "Hello familia 44!!!";
	}
}

