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

import br.com.wmsoft.sis03.model.Fornecedor;
import br.com.wmsoft.sis03.repository.Fornecedores;
import br.com.wmsoft.sis03.service.CadastroFornecedorService;

@Controller
@RequestMapping("fornecedores")
public class FornecedorController {
	
	private static final String HOME_VIEW = "fornecedor/Fornecedor";

	@Autowired   
	Fornecedores fornecedores;	
	
	@Autowired
	CadastroFornecedorService cadastroFornecedorService;
	
	@GetMapping
	public ModelAndView pesquisar(Fornecedor fornecedor){
		ModelAndView mv = new ModelAndView(HOME_VIEW);
		mv.addObject("todosFornecedores",fornecedores.findAll());
		
		return mv;
	}
	@RequestMapping("/novo")
	public ModelAndView novo(Fornecedor fornecedor){
		

		ModelAndView mv = new ModelAndView( HOME_VIEW);
			
		return mv;
	}

	@GetMapping("/{codigo}")
		public ModelAndView edicao(@PathVariable("codigo") Fornecedor fornecedor) {
			ModelAndView mv = novo(fornecedor);
			mv.addObject(fornecedor);
			return mv;
		}
	@PostMapping(value= {"/novo", "{\\d+}"})
	public ModelAndView salvar(@Valid Fornecedor fornecedor , BindingResult result,RedirectAttributes attributes ){
		   
		   if(result.hasErrors()){
			   
			   return novo(fornecedor);
		   }
		   
		   cadastroFornecedorService.salvar(fornecedor);
		   
		  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
		   return new ModelAndView ("redirect:/fornecedores");
	      }
	@RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
	public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
		   cadastroFornecedorService.excluir(codigo);
		   attributes.addFlashAttribute("mensagem", "Fornecedor excluido com Sucesso!");
		   return "redirect:/fornecedores";
	}
	


}
