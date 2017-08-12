package br.com.wmsoft.sis03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.wmsoft.sis03.model.Cliente;
import br.com.wmsoft.sis03.repository.Clientes;

@Controller
@RequestMapping("clientes")
public class ClienteController {

private static final String HOME_VIEW = "cliente/Cliente";
	
@Autowired   
Clientes clientes;
	
@GetMapping
public ModelAndView pesquisar(Cliente cliente){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
	mv.addObject("todosClientes",clientes.findAll());
	
	return mv;
		
}
}
