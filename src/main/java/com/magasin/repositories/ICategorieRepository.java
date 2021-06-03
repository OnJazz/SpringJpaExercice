package com.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.models.Categorie;

public interface ICategorieRepository extends JpaRepository<Categorie, Long>{

}
