
package com.example.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio1")
public class exercicio1Controller {

	@GetMapping
	public String Mentalidades_Habilidades() {
		return "Mentalidades: persistência, mentalidade de crescimento!\n"
				+ "Habilidades: Atenção aos detalhes, proatividade!";
	}
	@GetMapping ("/objetivos")
	public String Objetivos() {
		return "Melhorar minha comunicação e ficar atento aos novos conteúdos propostos no bloco 2!";
	}
}
