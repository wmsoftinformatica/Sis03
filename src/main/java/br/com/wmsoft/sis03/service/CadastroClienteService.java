package br.com.wmsoft.sis03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import br.com.wmsoft.sis03.model.Cliente;
import br.com.wmsoft.sis03.repository.Clientes;


@Service
public class CadastroClienteService {

	@Autowired
	Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente){
		
		clientes.save(cliente);
	}
	
	public void excluir(Long codigo){
		clientes.delete(codigo);	
	} 

}
