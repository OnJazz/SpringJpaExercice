package com.magasin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Client;
import com.magasin.models.Commande;
import com.magasin.repositories.ICommandeRepository;
import com.magasin.services.ICommandeService;

public class CommandeService implements ICommandeService{
	
	@Autowired
	private ICommandeRepository repository;
	
	public List<Commande> getAll() {
		return this.repository.findAll();
	}

	public Commande getById(Long id) {
		return this.repository.findById(id).get();
	}

	public Commande save(Commande commande) {
		return this.repository.save(commande);
	}

	public Commande update(Commande commande) {
		return this.repository.save(commande);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);	
	}

	public List<Commande> filterCommande(Client client) {
		return this.repository.getCommandeByClient(client);
	}

}
