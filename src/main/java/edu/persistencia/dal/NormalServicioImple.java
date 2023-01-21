package edu.persistencia.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//Repositorio, implementación de las interfaz
@Repository
public class NormalServicioImple implements NormalServicio{
	
	@PersistenceContext
	EntityManager entityManager;

	public void insertaRepostaje(Normal normal) {

		entityManager.persist(normal);
	}

	public List<Normal> todosRepostajes() {
		
		return entityManager.createQuery("SELECT normal FROM Normal normal").getResultList();
	}

}
