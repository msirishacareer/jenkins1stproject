package com.example.jenkinsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jencontrollerr {
	@GetMapping
	public String siri() {
		return "siri i love u to";
	}

}
