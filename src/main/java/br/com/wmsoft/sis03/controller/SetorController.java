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

import br.com.wmsoft.sis03.model.Setor;
import br.com.wmsoft.sis03.repository.Setores;
import br.com.wmsoft.sis03.service.CadastroSetorService;

@Controller
@RequestMapping("setores")
public class SetorController {
	private static final String HOME_VIEW = "setor/setor";
	private static final String CADASTRO_VIEW = "setor/CadastroSetor";
	
	@Autowired
	Setores setores;
	
	@Autowired
	CadastroSetorService cadastroSetorService;
	
	
	@RequestMapping("/novo")
//	@RequestMapping
	public ModelAndView novo(Setor setor){
		

		ModelAndView mv = new ModelAndView( CADASTRO_VIEW);
			
		return mv;
	}
	
	@GetMapping
	public ModelAndView pesquisar(Setor setor) {
		ModelAndView mv = new ModelAndView(HOME_VIEW);
		
		mv.addObject("todossetores",setores.findAll() );

		return mv;
	}
	
//	se tiver um digito ou enviar para o novo
	
   @PostMapping(value= {"/novo", "{\\d+}"})
   public ModelAndView salvar(@Valid Setor setor , BindingResult result,RedirectAttributes attributes ){
	   
	   if(result.hasErrors()){
		   
		   return novo(setor);
	   }
	   
	   cadastroSetorService.salvar(setor);
	   
	  attributes.addFlashAttribute("mensagem","Cadastrado efetuado com Sucesso");
	   return new ModelAndView ("redirect:/setores");
   }
	
   @GetMapping("/{codigo}")
	public ModelAndView edicao(@PathVariable("codigo") Setor setor) {
		ModelAndView mv = novo(setor);
		mv.addObject(setor);
		return mv;
	}
   
   @RequestMapping(value="{codigo}",method = RequestMethod.DELETE)
   public String excluir (@PathVariable Long codigo, RedirectAttributes attributes){
	   cadastroSetorService.excluir(codigo);
	   attributes.addFlashAttribute("mensagem", "Setor excluido com Sucesso!");
	   return "redirect:/setores";
   }
	
}
