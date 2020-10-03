package com.regis.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.regis.tdd.service.ClienteService;
@SpringBootTest
class TddApplicationTests {

	@Autowired
	private ClienteService clienteService;

	@Test
	void listaNomeClienteTesteBanco() {
		String output = clienteService.listaNomeCliente(2);

		assertEquals("Paulo Santos", output);
	}
	
}
