package br.com.wmsoft.sis03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.wmsoft.sis03.model.Produto;
import br.com.wmsoft.sis03.repository.Produtos;

@Controller	
@RequestMapping("produtos")
public class ProdutoController {
	
private static final String HOME_VIEW = "produto/Produto";
	
@Autowired
Produtos produtos;
    
@GetMapping
public ModelAndView pesquisar(Produto produto){
	ModelAndView mv = new ModelAndView(HOME_VIEW);
    mv.addObject("todosProdutos", produtos.findAll());
    
    return mv;
}
}