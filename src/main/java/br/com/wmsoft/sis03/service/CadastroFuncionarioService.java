package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wmsoft.sis03.model.Funcionario;
import br.com.wmsoft.sis03.repository.Funcionarios;

@Service
public class CadastroFuncionarioService {
	
	@Autowired
	Funcionarios funcionarios;
	
	@Transactional
	public void salvar(Funcionario funcionario){
		
		funcionarios.save(funcionario);
	}
	
	public void excluir(Long codigo){
		funcionarios.delete(codigo);	
	} 

}
