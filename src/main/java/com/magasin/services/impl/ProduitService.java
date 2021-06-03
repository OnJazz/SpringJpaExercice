package com.magasin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Produit;
import com.magasin.repositories.IProduitRepository;
import com.magasin.services.IGenericService;

public class ProduitService implements IGenericService<Produit>{
	
	@Autowired
	private IProduitRepository repository;
	
	public List<Produit> getAll() {
		return this.repository.findAll();
	}

	public Produit getById(Long id) {
		return this.repository.findById(id).get();
	}

	public Produit save(Produit produit) {
		return this.repository.save(produit);
	}

	public Produit update(Produit produit) {
		return this.repository.save(produit);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);	
	}

}
