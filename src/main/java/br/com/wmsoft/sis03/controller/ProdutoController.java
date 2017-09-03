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

import br.com.wmsoft.sis03.model.Produto;
import br.com.wmsoft.sis03.model.SN;
import br.com.wmsoft.sis03.repository.Produtos;
import br.com.wmsoft.sis03.service.CadastroProdutoService;

@Controller	
@RequestMapping("produtos")
public class ProdutoController {
	
private static final String HOME_VIEW = "produto/Produto";
	
@Autowired
Produtos produtos;
    
@Autowired
CadastroProdutoService cadastroProdutoService;

@GetMapping
public ModelAndView pesquisar(Produto produto){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
    mv.addObject("todosProdutos", produtos.findAll());
    
    return mv;
}

@RequestMapping("/novo")
public ModelAndView novo(Produto produto){
	

	ModelAndView mv = new ModelAndView( HOME_VIEW);
		
	return mv;
}

@GetMapping("/{codigo}")
	public ModelAndView edicao(@PathVariable("codigo") Produto produto) {
		ModelAndView mv = novo(produto);
		mv.addObject(produto);
		return mv;
	}

@PostMapping(value= {"/novo", "{\\d+}"})
public ModelAndView salvar(@Valid Produto produto , BindingResult result,RedirectAttributes attributes ){
	   
	   if(result.hasErrors()){
		   
		   return novo(produto);
	   }
	   
	   cadastroProdutoService.salvar(produto);
	   
	  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
	   return new ModelAndView ("redirect:/produtos");
}

@RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
	   cadastroProdutoService.excluir(codigo);
	   attributes.addFlashAttribute("mensagem", "Produto excluido com Sucesso!");
	   return "redirect:/produtos";
}
@ModelAttribute("todosSN")
public List<SN> todosSN(){
	
	return Arrays.asList(SN.values());
}

@ModelAttribute("todosImprimir")
public List<Imprimir> todosImprimir(){
	
	return Arrays.asList(Imprimir.values());
}

}