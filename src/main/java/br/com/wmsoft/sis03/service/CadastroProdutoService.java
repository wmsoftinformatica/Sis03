package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wmsoft.sis03.model.Produto;
import br.com.wmsoft.sis03.repository.Produtos;

@Service
public class CadastroProdutoService {
	@Autowired
	Produtos produtos;
	
	@Transactional
	public void salvar(Produto produto){
		
		produtos.save(produto);
	}
	
	public void excluir(Long codigo){
		produtos.delete(codigo);	
	} 

}
