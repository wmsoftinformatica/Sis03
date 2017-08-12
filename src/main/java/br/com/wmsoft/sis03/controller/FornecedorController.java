package br.com.wmsoft.sis03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.wmsoft.sis03.model.Fornecedor;
import br.com.wmsoft.sis03.repository.Fornecedores;

@Controller
@RequestMapping("fornecedores")
public class FornecedorController {
	
	private static final String HOME_VIEW = "fornecedor/Fornecedor";

	@Autowired   
	Fornecedores fornecedores;	
		
	@GetMapping
	public ModelAndView pesquisar(Fornecedor fornecedor){
		ModelAndView mv = new ModelAndView(HOME_VIEW);
		mv.addObject("todosFornecedores",fornecedores.findAll());
		
		return mv;
	}


}
