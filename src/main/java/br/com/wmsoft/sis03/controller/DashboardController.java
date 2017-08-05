package br.com.wmsoft.sis03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DashboardController {
	
	@RequestMapping
	public ModelAndView home(){
		
	
		ModelAndView mv = new ModelAndView("Dashboard");

		
		return mv;
	}

}
