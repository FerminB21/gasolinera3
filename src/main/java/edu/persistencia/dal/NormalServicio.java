package edu.persistencia.dal;

import java.util.List;

public interface NormalServicio {
	
	//Metodo para la insercion de un repostaje normal
	public void insertaRepostaje(Normal normal);
	
	//Metodo que muestra todos los repostages. 
	public List<Normal> todosRepostajes();

}
