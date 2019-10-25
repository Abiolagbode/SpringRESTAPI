package com.etz.abiolagbode.waxnote.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
	
	@PostMapping("/custom")
	public String custom() {
		return "custom";
	}

}
