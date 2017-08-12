package br.com.wmsoft.sis03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wmsoft.sis03.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
