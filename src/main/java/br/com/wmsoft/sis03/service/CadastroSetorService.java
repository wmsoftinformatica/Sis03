package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wmsoft.sis03.model.Setor;
import br.com.wmsoft.sis03.repository.Setores;

@Service
public class CadastroSetorService {
	
	@Autowired
	Setores setores;
	
	@Transactional
	public void salvar(Setor setor){
		
		setores.save(setor);
	}
	
public void excluir(Long codigo){
setores.delete(codigo);	
} 
	
}
