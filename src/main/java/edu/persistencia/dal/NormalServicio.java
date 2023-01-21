package edu.persistencia.dal;

import java.util.List;

public interface NormalServicio {
	
	//Metodo para la inserción de un repostaje normal
	public void insertaRepostaje(Normal normal);
	
	//Metodo que muestra todos los repostajes. 
	public List<Normal> todosRepostajes();

}
