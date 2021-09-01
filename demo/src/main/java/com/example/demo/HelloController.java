package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
	@RequestMapping
	public String user() {
		System.out.println("Hello");
		return "greet";
	}
	@RequestMapping("/loginpage")
	public String loginuser()
	{	
		return "loginpage";
	}

}
