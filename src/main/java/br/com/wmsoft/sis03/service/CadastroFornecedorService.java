package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wmsoft.sis03.model.Fornecedor;
import br.com.wmsoft.sis03.repository.Fornecedores;

@Service
public class CadastroFornecedorService {
	
	@Autowired
	Fornecedores fornecedores;
	
	@Transactional
	public void salvar(Fornecedor fornecedor){
		
		fornecedores.save(fornecedor);
	}
	
	public void excluir(Long codigo){
		fornecedores.delete(codigo);	
	} 

}
