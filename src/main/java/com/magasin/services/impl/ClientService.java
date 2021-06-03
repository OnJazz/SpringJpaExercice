package com.magasin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Client;
import com.magasin.repositories.IClientRepository;
import com.magasin.services.IGenericService;

public class ClientService implements IGenericService<Client>{
	
	@Autowired
	private IClientRepository repository;
	
	public List<Client> getAll() {
		return this.repository.findAll();
	}

	public Client getById(Long id) {
		return this.repository.findById(id).get();
	}

	public Client save(Client client) {
		return this.repository.save(client);
	}

	public Client update(Client client) {
		return this.repository.save(client);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);	
	}
	
	

}
