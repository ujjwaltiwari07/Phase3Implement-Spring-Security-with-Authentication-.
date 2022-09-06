package com.example.SpringSecurityProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
@GetMapping("/")
public String getMessage() {
	return "<h1>Welcome You Login Successfully </h1>";
}

}