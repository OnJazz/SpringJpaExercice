package com.magasin.services;

import java.util.List;

import com.magasin.models.Client;
import com.magasin.models.Commande;

public interface ICommandeService extends IGenericService<Commande>{
	
	public List<Commande> filterCommande(Client client);

}
