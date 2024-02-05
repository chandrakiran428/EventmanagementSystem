package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
  
	@RequestMapping("home")
	public ModelAndView method1(@RequestParam("name") String myName ) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("register.jsp");
		System.out.println("hi hello java " );
		
		return mv;
	}
}
