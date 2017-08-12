package br.com.wmsoft.sis03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.wmsoft.sis03.model.Banco;
import br.com.wmsoft.sis03.repository.Bancos;

@Controller
@RequestMapping("bancos")
public class BancoController {
	
private static final String HOME_VIEW = "banco/Banco";

@Autowired   
Bancos bancos;	
	
@GetMapping
public ModelAndView pesquisar(Banco banco){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
	mv.addObject("todosBancos",bancos.findAll());
	
	return mv;
}

@RequestMapping("/novo")
public ModelAndView novo(Banco banco){
	

	ModelAndView mv = new ModelAndView( HOME_VIEW);
		
	return mv;
}

@GetMapping("/{codigo}")
	public ModelAndView edicao(@PathVariable("codigo") Banco banco) {
		ModelAndView mv = novo(banco);
		mv.addObject(banco);
		return mv;
	}
}
