package br.com.wmsoft.sis03.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.wmsoft.sis03.model.Cliente;
import br.com.wmsoft.sis03.model.ClienteAtivo;
import br.com.wmsoft.sis03.model.TipoPessoa;
import br.com.wmsoft.sis03.model.UF;
import br.com.wmsoft.sis03.repository.Clientes;
import br.com.wmsoft.sis03.service.CadastroClienteService;

@Controller
@RequestMapping("clientes")
public class ClienteController {

private static final String HOME_VIEW = "cliente/Cliente";
	
@Autowired   
Clientes clientes;

@Autowired
CadastroClienteService cadastroClienteService;

@GetMapping
public ModelAndView pesquisar(Cliente cliente){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
	mv.addObject("todosClientes",clientes.findAll());
	
	
	return mv;
		
}

@RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
	   cadastroClienteService.excluir(codigo);
	   attributes.addFlashAttribute("mensagem", "Cliente excluido com Sucesso!");
	   return "redirect:/clientes";
}
@RequestMapping("/novo")
public ModelAndView novo(Cliente cliente){
	

	ModelAndView mv = new ModelAndView( HOME_VIEW);
	
	return mv;
}
@PostMapping(value= {"/novo", "{\\d+}"})
public ModelAndView salvar(@Valid Cliente cliente , BindingResult result,RedirectAttributes attributes ){
	   
	   if(result.hasErrors()){
		   
		   return novo(cliente);
	   }
	   
	   cadastroClienteService.salvar(cliente);
	   
	  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
	   return new ModelAndView ("redirect:/clientes");
}

@GetMapping("/{codigo}")
public ModelAndView edicao(@PathVariable("codigo") Cliente cliente) {
	ModelAndView mv = novo(cliente);
	mv.addObject(cliente);
	return mv;
}

@ModelAttribute("todosTipoPessoa")
public List<TipoPessoa> todosTipoPessoa(){
	
	return Arrays.asList(TipoPessoa.values());
	
}

@ModelAttribute("todosUF")
public List<UF> todosUF(){
	
	return Arrays.asList(UF.values());
}

@ModelAttribute("todosClienteAtivo")
public List<ClienteAtivo> todosClienteAtivo(){
	
	return Arrays.asList(ClienteAtivo.values());
}

}
