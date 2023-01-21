package edu.persistencia.dal;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Clase con la entidad de los repostajes Normales
@Entity
@Table(name="normal", schema="dlk_gasolinera")
public class Normal {
	
	//Atributos
	@Id
	@Column(name = "id_Normal") 
	private int id_Normal;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "md_date_Normal", nullable = false) 
	private Calendar md_date_Normal = new GregorianCalendar(2023, 12, 31, 23, 59);
	
	@Column(name = "precio_Normal", nullable = false) 
	private double precio_Normal = 0;

	@Column(name = "md_uuid_Normal", nullable = false)
	private String md_uuid_Normal = "No Informado";
	

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

	public String getMd_uuid_Normal() {
		return md_uuid_Normal;
	}

	public void setMd_uuid_Normal(String md_uuid_Normal) {
		this.md_uuid_Normal = md_uuid_Normal;
	}

	
	//Constructores
	public Normal(int id_Normal, Calendar md_date_Normal, double precio_Normal, String md_uuid_Normal) {
		super();
		this.id_Normal = id_Normal;
		this.md_date_Normal = md_date_Normal;
		this.precio_Normal = precio_Normal;
		this.md_uuid_Normal = md_uuid_Normal;
	}
	
	public Normal(int id_Normal, Calendar md_date_Normal, double precio_Normal) {
		super();
		this.id_Normal = id_Normal;
		this.md_date_Normal = md_date_Normal;
		this.precio_Normal = precio_Normal;
		this.md_uuid_Normal = this.md_uuid_Normal;

	}

	public Normal() {
		super();
	}

	
}
