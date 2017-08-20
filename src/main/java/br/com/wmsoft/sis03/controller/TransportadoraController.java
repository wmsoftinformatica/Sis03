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

import br.com.wmsoft.sis03.model.Transportadora;
import br.com.wmsoft.sis03.repository.Transportadoras;
import br.com.wmsoft.sis03.service.CadastroTransportadoraService;


@Controller
@RequestMapping("transportadoras")
public class TransportadoraController {
	
private static final String HOME_VIEW = "transportadora/Transportadora";

@Autowired
Transportadoras transportadoras;

@Autowired
CadastroTransportadoraService cadastroTransportadoraService;

@GetMapping
public ModelAndView pesquisa(Transportadora transportadora){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
	mv.addObject("todosTransportadoras",transportadoras.findAll());
	
	return mv;
	
}

@RequestMapping("/novo")
public ModelAndView novo(Transportadora transportadora){
	

	ModelAndView mv = new ModelAndView( HOME_VIEW);
		
	return mv;
}	

@GetMapping("/{codigo}")
public ModelAndView edicao(@PathVariable("codigo") Transportadora transportadora) {
	ModelAndView mv = novo(transportadora);
	mv.addObject(transportadora);
	return mv;
}

@PostMapping(value= {"/novo", "{\\d+}"})
public ModelAndView salvar(@Valid Transportadora transportadora , BindingResult result,RedirectAttributes attributes ){
	   
	   if(result.hasErrors()){
		   
		   return novo(transportadora);
	   }
	   
	   cadastroTransportadoraService.salvar(transportadora);
	   
	  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
	   return new ModelAndView ("redirect:/transportadoras");
}

@RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
	   cadastroTransportadoraService.excluir(codigo);
	   attributes.addFlashAttribute("mensagem", "Transportadora excluido com Sucesso!");
	   return "redirect:/transportadoras";
}
}
