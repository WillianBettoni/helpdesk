package com.willian.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.willian.helpdesk.domain.Chamado;
import com.willian.helpdesk.domain.Cliente;
import com.willian.helpdesk.domain.Tecnico;
import com.willian.helpdesk.domain.enums.Perfil;
import com.willian.helpdesk.domain.enums.Prioridade;
import com.willian.helpdesk.domain.enums.Status;
import com.willian.helpdesk.repositories.ChamadoRepository;
import com.willian.helpdesk.repositories.ClienteRepository;
import com.willian.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Willian Bettoni", "99324969013", encoder.encode("123"), "willian@email.com");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Alex Cliente", "85166102096", encoder.encode("123"), "alex@email.com");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
