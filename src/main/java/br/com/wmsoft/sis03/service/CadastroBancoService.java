package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wmsoft.sis03.model.Banco;
import br.com.wmsoft.sis03.repository.Bancos;

@Service
public class CadastroBancoService {

	@Autowired
	Bancos bancos;
	
	@Transactional
	public void salvar(Banco banco){
		
		bancos.save(banco);
	}
	
	public void excluir(Long codigo){
		bancos.delete(codigo);	
	} 
}
