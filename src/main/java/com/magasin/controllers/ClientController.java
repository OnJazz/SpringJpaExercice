package com.magasin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasin.models.Client;
import com.magasin.services.IGenericService;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	@Autowired
	private IGenericService<Client> service;
	
	@GetMapping()
	public List<Client> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping("{id}")
	public Client getVoitureById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Client saveMessage(@RequestBody Client client) {
		return this.service.save(client);
	}
	
	@PatchMapping()
	public Client update(@RequestBody Client client) {
		return this.service.update(client);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}
