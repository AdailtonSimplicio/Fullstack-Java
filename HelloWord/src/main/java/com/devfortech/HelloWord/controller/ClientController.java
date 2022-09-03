package com.devfortech.HelloWord.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfortech.HelloWord.dto.ClientsDTO;
import com.devfortech.HelloWord.services.ClientsService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientsService service;
	
	@GetMapping
	public ArrayList<ClientsDTO> findAll() {
		ArrayList<ClientsDTO> clients = service.findAll();
		return clients;
	}
	@GetMapping(value = "/{id}")
	public ClientsDTO finById(@PathVariable Long id) {
		ClientsDTO clients = service.finById(id);
	
	return clients;
	}
	

}
