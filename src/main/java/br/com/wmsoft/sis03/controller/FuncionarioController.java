package br.com.wmsoft.sis03.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.wmsoft.sis03.model.Funcionario;
import br.com.wmsoft.sis03.repository.Funcionarios;
import br.com.wmsoft.sis03.service.CadastroFuncionarioService;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {
	
	private static final String HOME_VIEW = "funcionario/Funcionario";
	
	@Autowired
	Funcionarios funcionarios;
	
	@Autowired
	CadastroFuncionarioService cadastroFuncionarioService;
	
	@GetMapping
	public ModelAndView pesquisa(Funcionario funcionario){
		ModelAndView mv = new ModelAndView(HOME_VIEW);
		mv.addObject("todosFuncionarios",funcionarios.findAll());
		
		return mv;
		
	}
	@RequestMapping("/novo")
	public ModelAndView novo(Funcionario funcionario){
		

		ModelAndView mv = new ModelAndView( HOME_VIEW);
			
		return mv;
	}
	@PostMapping(value= {"/novo", "{\\d+}"})
	public ModelAndView salvar(@Valid Funcionario funcionario , BindingResult result,RedirectAttributes attributes ){
		   
		   if(result.hasErrors()){
			   
			   return novo(funcionario);
		   }
		   
		   cadastroFuncionarioService.salvar(funcionario);
		   
		  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
		   return new ModelAndView ("redirect:/funcionarios");
	}
			
	@RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
	public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
		   cadastroFuncionarioService.excluir(codigo);
		   attributes.addFlashAttribute("mensagem", "Funcionario excluido com Sucesso!");
		   return "redirect:/funcionarios";
	}
	
	@GetMapping("/{codigo}")
	public ModelAndView edicao(@PathVariable("codigo") Funcionario funcionario) {
		ModelAndView mv = novo(funcionario);
		mv.addObject(funcionario);
		return mv;
	}
}
