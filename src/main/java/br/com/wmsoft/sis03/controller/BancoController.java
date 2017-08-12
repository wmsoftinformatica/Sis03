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

import br.com.wmsoft.sis03.model.Banco;
import br.com.wmsoft.sis03.repository.Bancos;
import br.com.wmsoft.sis03.service.CadastroBancoService;


@Controller
@RequestMapping("bancos")
public class BancoController {
	
private static final String HOME_VIEW = "banco/Banco";

@Autowired   
Bancos bancos;	

@Autowired
CadastroBancoService cadastroBancoService;
	
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

@PostMapping(value= {"/novo", "{\\d+}"})
public ModelAndView salvar(@Valid Banco banco , BindingResult result,RedirectAttributes attributes ){
	   
	   if(result.hasErrors()){
		   
		   return novo(banco);
	   }
	   
	   cadastroBancoService.salvar(banco);
	   
	  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
	   return new ModelAndView ("redirect:/bancos");
}

@RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
	   cadastroBancoService.excluir(codigo);
	   attributes.addFlashAttribute("mensagem", "Banco excluido com Sucesso!");
	   return "redirect:/bancos";
}

}
