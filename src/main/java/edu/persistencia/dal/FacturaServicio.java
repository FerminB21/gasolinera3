package edu.persistencia.dal;

import java.util.List;

public interface FacturaServicio {
	
	//Metodo para la inserción de un repostaje con factura
	public void insertaRepostaje(Factura factura);
	
	//Metodo que muestra todos los repostajes. 
	public List<Factura> todosRepostajes();

}
