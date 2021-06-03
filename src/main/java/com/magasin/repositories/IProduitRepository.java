package com.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.models.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long>{

}
