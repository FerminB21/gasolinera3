package edu.persistencia.dal;

import java.util.List;

public interface FacturaServicio {
	
	//Metodo para la insercion de un repostaje con factura
	public void insertaRepostaje(Factura factura);
	
	//Metodo que muestra todos los repostages. 
	public List<Factura> todosRepostajes();

}
