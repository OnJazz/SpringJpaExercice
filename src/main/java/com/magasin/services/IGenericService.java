package com.magasin.services;

import java.util.List;


public interface IGenericService<T>{

	public List<T> getAll();

	public T getById(Long id);

	public T save(T moteur);

	public T update(T entite);

	public void delete(Long id);

}
