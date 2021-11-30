package com.skills.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
public class SkillsController {
	
	@GetMapping
	String skills() {
		
		return "Mentalidade: Persistência"
				+ "\nHabilidade: Orientação ao detalhe";
	}
}
