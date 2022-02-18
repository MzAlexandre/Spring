package com.helloWorld.hello.atv1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atv1")

public class Atv1 {

	@GetMapping
	public String hello() {
		return("Persistência - atenção aos detalhes");	
	}
}