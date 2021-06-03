package com.magasin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Categorie;
import com.magasin.repositories.ICategorieRepository;
import com.magasin.services.IGenericService;

public class CategorieService implements IGenericService<Categorie> {
	
	@Autowired
	private ICategorieRepository repository;
	
	public List<Categorie> getAll() {
		return this.repository.findAll();
	}

	public Categorie getById(Long id) {
		return this.repository.findById(id).get();
	}

	public Categorie save(Categorie categorie) {
		return this.repository.save(categorie);
	}

	public Categorie update(Categorie categorie) {
		return this.repository.save(categorie);
	}

	public void delete(Long id) {
		this.repository.deleteById(id);	
	}

}
