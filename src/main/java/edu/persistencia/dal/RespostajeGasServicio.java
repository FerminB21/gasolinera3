package edu.persistencia.dal;

import java.util.List;

public interface RespostajeGasServicio {
	
	//Metodo que muestra todos los repostajes. 
	public List<RepostajeGas> todosRepostajes();
	
	//Importe total del combustible vendido
	public double totalImporte();
	
	//Inserta fecha de llenado del depósito.
	public void llenadoDeposito(RepostajeGas gasolinera);
	
	//Elimina el último llenado de depósito de la galorinera.
	public void borraUltimoLlenado();
	
	
}
