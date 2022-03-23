package com.willian.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
