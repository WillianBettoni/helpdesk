package com.willian.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
