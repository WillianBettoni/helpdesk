package com.willian.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
