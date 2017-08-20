package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wmsoft.sis03.model.Transportadora;
import br.com.wmsoft.sis03.repository.Transportadoras;

@Service
public class CadastroTransportadoraService {
	@Autowired
	Transportadoras transportadoras;
	
	@Transactional
	public void salvar(Transportadora transportadora){
		
		transportadoras.save(transportadora);
	}
	
	public void excluir(Long codigo){
		transportadoras.delete(codigo);	
	} 

}
