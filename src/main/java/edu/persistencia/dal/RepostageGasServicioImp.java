package edu.persistencia.dal;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class RepostageGasServicioImp implements RespostajeGasServicio{

	@PersistenceContext
	EntityManager entityManager;
	
	public List<RepostajeGas> todosRepostajes() {
	
		return entityManager.createQuery("SELECT repostajeGas FROM RepostajeGas repostajeGas").getResultList();
	}

	public double totalImporte() {
		
		double total = 0;
		List<Double> ventas = entityManager.createQuery("SELECT importeGas.coste FROM RepostajeGas importeGas").getResultList();
		
		
		for (double venta : ventas) {
			total =+ venta;
		}
		
		return total;
	}

	public void llenadoDeposito(RepostajeGas gasolinera) {
		
		entityManager.persist(gasolinera);
		
	}

	public void borraUltimoLlenado() {
		//Terminar borrado aqui!!!!!!!!!!!Hay que hacer la QUERY
		List<Integer> repoReciente = entityManager.createQuery("SELECT repostajegas FROM Repostajegas repostajegas ORDER BY repostajegas.fechallenado DESC").getResultList();
		entityManager.remove(repoReciente.get(0));
		
	}

}
