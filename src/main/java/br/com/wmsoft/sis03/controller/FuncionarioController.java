package br.com.wmsoft.sis03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.wmsoft.sis03.model.Funcionario;
import br.com.wmsoft.sis03.repository.Funcionarios;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {
	
	private static final String HOME_VIEW = "funcionario/Funcionario";
	
	@Autowired
	Funcionarios funcionarios;
	
	@GetMapping
	public ModelAndView pesquisa(Funcionario funcionario){
		ModelAndView mv = new ModelAndView(HOME_VIEW);
		mv.addObject("todosFuncionarios",funcionarios.findAll());
		
		return mv;
		
	}
	
			

}
