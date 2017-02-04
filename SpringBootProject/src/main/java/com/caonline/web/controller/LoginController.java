package com.caonline.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	 
	@RequestMapping("/login")
	public String testHelloWorld(ModelMap model){
		System.out.println("in hello world...................................................");
		model.addAttribute("name", "Hi There, Hello World!!!");
		return "index";
	}
 
}
