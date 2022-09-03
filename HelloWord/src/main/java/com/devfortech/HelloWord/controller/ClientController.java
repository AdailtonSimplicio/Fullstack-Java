package com.devfortech.HelloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfortech.HelloWord.dto.ClientsDTO;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@GetMapping(value = "/findall")
	public ClientsDTO findAll() {
		ClientsDTO clients = new ClientsDTO(1L,"adailton,", "11555599688", "57265000", "JAIME DE OLIVEIRA", "1052", "SÃO MIGUEL", "TEOTÔNIO VILELA", "ALAGOAS");
		return clients;
	}

}
