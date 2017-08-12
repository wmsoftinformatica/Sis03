package br.com.wmsoft.sis03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.wmsoft.sis03.model.Transportadora;
import br.com.wmsoft.sis03.repository.Transportadoras;


@Controller
@RequestMapping("transportadoras")
public class TransportadoraController {
	
private static final String HOME_VIEW = "transportadora/Transportadora";

@Autowired
Transportadoras transportadoras;

@GetMapping
public ModelAndView pesquisa(Transportadora transportadora){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
	mv.addObject("todosTransportadoras",transportadoras.findAll());
	
	return mv;
	
}

	

}
