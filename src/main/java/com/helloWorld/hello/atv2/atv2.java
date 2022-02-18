package com.helloWorld.hello.atv2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atv2")
public class atv2 {
	@GetMapping
	public String hello() {
		return("Aprender mais sobre Spring e banco de Dados.");	
	}

}