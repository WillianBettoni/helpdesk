package com.willian.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
