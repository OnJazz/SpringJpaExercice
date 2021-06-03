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

import com.magasin.models.Categorie;
import com.magasin.services.IGenericService;

@RestController
@RequestMapping("categories")
public class CategorieController {
	
	@Autowired
	private IGenericService<Categorie> service;
	
	@GetMapping()
	public List<Categorie> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping("{id}")
	public Categorie getVoitureById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Categorie saveMessage(@RequestBody Categorie categorie) {
		return this.service.save(categorie);
	}
	
	@PatchMapping()
	public Categorie update(@RequestBody Categorie categorie) {
		return this.service.update(categorie);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}

}
