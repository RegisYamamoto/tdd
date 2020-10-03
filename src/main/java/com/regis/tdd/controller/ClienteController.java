package com.regis.tdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.regis.tdd.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "")
	public ResponseEntity<String> listaNomeCliente(@RequestParam(required = true) int id) {
		String nome = clienteService.listaNomeCliente(id);

		return new ResponseEntity<String>(nome, HttpStatus.OK);
	}
	
}
