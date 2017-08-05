package br.com.wmsoft.sis03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wmsoft.sis03.model.Setor;

@Repository
public interface Setores extends JpaRepository<Setor, Long> {

}
