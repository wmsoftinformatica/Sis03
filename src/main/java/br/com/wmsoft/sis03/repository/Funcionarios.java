package br.com.wmsoft.sis03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wmsoft.sis03.model.Funcionario;

public interface Funcionarios extends JpaRepository<Funcionario, Long>{

}
