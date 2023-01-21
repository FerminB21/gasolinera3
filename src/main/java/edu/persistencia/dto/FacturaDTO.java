package edu.persistencia.dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Service;

//DTO de facturas
@Service
public class FacturaDTO {
	
	//ATRIBUTOS
	private int id_factura;
	
	private Calendar md_date_factura;
	
	private double precio_factura;
	
	private String dni;
	
	private String matricula;

	
	//Propiedades
	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public Calendar getMd_date_factura() {
		return md_date_factura;
	}

	public void setMd_date_factura(Calendar md_date_factura) {
		this.md_date_factura = md_date_factura;
	}

	public double getPrecio_factura() {
		return precio_factura;
	}

	public void setPrecio_factura(int precio_factura) {
		this.precio_factura = precio_factura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	//Constructores
	public FacturaDTO(int id_factura, Calendar md_date_factura, double precio_factura, String dni,
			String matricula) {
		super();
		this.id_factura = id_factura;
		this.md_date_factura = md_date_factura;
		this.precio_factura = precio_factura;
		this.dni = dni;
		this.matricula = matricula;
	}

	public FacturaDTO() {
		super();
	}
	
	//ToString
	@Override
	public String toString() {
		return "FacturaDTO [id_factura=" + id_factura + ", md_date_factura=" + md_date_factura.getTime() + ", precio_factura="
				+ precio_factura + ", dni=" + dni + ", matricula=" + matricula + "]";
	}
	
	

}
