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
import com.magasin.models.Commande;
import com.magasin.services.ICommandeService;

@RestController
@RequestMapping("commandes")
public class CommandeController {
	
	@Autowired
	private ICommandeService service;
	
	@GetMapping()
	public List<Commande> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping("{id}")
	public Commande getById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@GetMapping("user")
	public List<Commande> getCommandeByName(@RequestBody Client client){
		return this.service.filterCommande(client);
	}
	
	@PostMapping()
	public Commande saveMessage(@RequestBody Commande commande) {
		return this.service.save(commande);
	}
	
	@PatchMapping()
	public Commande update(@RequestBody Commande commande) {
		return this.service.update(commande);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}
