package br.com.wmsoft.sis03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wmsoft.sis03.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long>{

}
