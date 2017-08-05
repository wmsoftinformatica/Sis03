package br.com.wmsoft.sis03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bancos")
public class BancoController {
    
	@RequestMapping("/novo")
	public String novo(){
		
		return "banco/CadastroBanco";
	}
}
