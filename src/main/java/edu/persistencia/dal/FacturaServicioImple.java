package edu.persistencia.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//Repositorio, implementación de las interfaz
@Repository
public class FacturaServicioImple implements FacturaServicio{

	@PersistenceContext
	EntityManager entityManager;
	
	public void insertaRepostaje(Factura factura) {
		entityManager.persist(factura);

	}

	public List<Factura> todosRepostajes() {
				
		return entityManager.createQuery("SELECT factura FROM Factura factura").getResultList();
	}

}
