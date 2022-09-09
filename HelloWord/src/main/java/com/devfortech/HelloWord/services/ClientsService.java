package com.devfortech.HelloWord.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devfortech.HelloWord.dto.ClientsDTO;
import com.devfortech.HelloWord.entities.Clients;
import com.devfortech.HelloWord.repository.ClientsRepository;

@Service
public class ClientsService {
	
	@Autowired
	private ClientsRepository repository;
	
	public ArrayList<ClientsDTO> findAll(){
		
		ArrayList<Clients> clients = repository.findAll();
		
	return clients;
		
	}
		

	public ClientsDTO findById(Long id) {
		ClientsDTO client = new ClientsDTO(id,"adailton,", "11555599688", "57265000", "JAIME DE OLIVEIRA", "1052", "SÃO MIGUEL", "TEOTÔNIO VILELA", "ALAGOAS");
		return client;
	}


	public ClientsDTO insert(ClientsDTO dto) {
		Clients client = new Clients(dto);
		
		return client;
	}


	public ClientsDTO update(Long id, ClientsDTO dto) {
		ClientsDTO client = new Clients(dto);
	
	}


	public ClientsDTO delete(Long id) {
		return null;
		
	}
}
