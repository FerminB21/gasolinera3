package edu.persistencia.dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Service;

//DTO correspondiente a facturas
@Service
public class NormalDTO {

	//Atributos
	private int id_Normal;
	
	private Calendar md_date_Normal;
	
	private double precio_Normal;
	

	//Propiedades
	public int getId_Normal() {
		return id_Normal;
	}

	public void setId_Normal(int id_Normal) {
		this.id_Normal = id_Normal;
	}

	public Calendar getMd_date_Normal() {
		return md_date_Normal;
	}

	public void setMd_date_Normal(Calendar md_date_Normal) {
		this.md_date_Normal = md_date_Normal;
	}

	public double getPrecio_Normal() {
		return precio_Normal;
	}

	public void setPrecio_Normal(int precio_Normal) {
		this.precio_Normal = precio_Normal;
	}

	
	//Constructores
	public NormalDTO(int id_Normal, Calendar md_date_Normal, double precio_Normal) {
		super();
		this.id_Normal = id_Normal;
		this.md_date_Normal = md_date_Normal;
		this.precio_Normal = precio_Normal;

	}

	public NormalDTO() {
		super();
	}

	//ToString
	@Override
	public String toString() {
		return "NormalDTO [id_Normal=" + id_Normal + ", md_date_Normal=" + md_date_Normal.getTime() + ", precio_Normal="
				+ precio_Normal + "]";
	}
	
	
}
