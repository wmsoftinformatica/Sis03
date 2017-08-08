package br.com.wmsoft.sis03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wmsoft.sis03.model.Banco;

public interface Bancos extends JpaRepository<Banco, Long> {

}
