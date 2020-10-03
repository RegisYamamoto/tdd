package com.regis.tdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.regis.tdd.model.Cliente;
import com.regis.tdd.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public String listaNomeCliente(@RequestParam(required = true) int id) {
		Cliente cliente = clienteRepository.findById(id).get();

		return cliente.getNome();
	}
	
}
