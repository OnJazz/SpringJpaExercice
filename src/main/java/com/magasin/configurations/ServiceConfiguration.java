package com.magasin.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.magasin.models.Categorie;
import com.magasin.models.Client;
import com.magasin.models.Commande;
import com.magasin.models.Produit;
import com.magasin.services.ICommandeService;
import com.magasin.services.IGenericService;
import com.magasin.services.impl.CategorieService;
import com.magasin.services.impl.ClientService;
import com.magasin.services.impl.CommandeService;
import com.magasin.services.impl.ProduitService;

@Configuration
public class ServiceConfiguration {
	
	@Bean
	public IGenericService<Client> clientServiceFactory() {
		return new ClientService();
	}
	
	@Bean
	public ICommandeService commandeServiceFactory() {
		return new CommandeService();
	}
	
	@Bean
	public IGenericService<Categorie> categorieServiceFactory() {
		return new CategorieService();
	}
	
	@Bean
	public IGenericService<Produit> produitServiceFactory() {
		return new ProduitService();
	}
	

}
