package com.magasin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.models.Client;
import com.magasin.models.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long>{
	
	public List<Commande> getCommandeByClient(Client client);

}
