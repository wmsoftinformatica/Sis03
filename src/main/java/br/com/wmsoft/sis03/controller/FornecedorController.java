package br.com.wmsoft.sis03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("fornecedores")
public class FornecedorController {
	
	@RequestMapping
	public String pesquisar(){
		
		return "fornecedor/fornecedor";
	}
	
//	@RequestMapping("/novo")
//	public String novo(){
//		
//		return "fornecedor/CadastroFornecedor";
//	}

}
