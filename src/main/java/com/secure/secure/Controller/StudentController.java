package com.secure.secure.Controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/get")
	public String get() {
		return "Welcome";
	}
	
	@PostMapping("/post")
	public String post() {
		return "Naveen";
	}
	
	 @GetMapping("/csrf")
	    public CsrfToken getCsrfToken(CsrfToken token) {
	        return token;
	    }

}
