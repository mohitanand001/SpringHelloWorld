package com.gontuseries.hellocontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping("greet")
public class HelloController {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
		
		return modelandview;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
		
		return modelandview;
	}	
}