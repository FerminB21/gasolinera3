package edu.persistencia.dal;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Clase con la entidad del repostaje de la gasolinera
@Entity
@Table(name="repostajeGas", schema="dlk_gasolinera")
public class RepostajeGas {
	
	//Atributos
	@Id
	@Column(name = "id_repoGas") 
	private int id_repoGas;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "fechaLlenado", nullable = false)
	private Calendar fechaLlenado = new GregorianCalendar(2023, 12, 31, 23, 59);
	
	@Column(name = "litrosRepostados", updatable = false, nullable = false) 
	private double litrosRepostados = 0;
	
	@Column(name = "coste", nullable = false) 
	private double coste = 0;
	
	@Column(name = "tipoCombustible", nullable = false)
	private String tipoCombustible = "No Informado";
	
	@Column(name = "md_uuid_repoGas", nullable = false)
	private String md_uuid_repoGas = "No Informado";

	
	//Propiedades
	public int getId_repoGas() {
		return id_repoGas;
	}

	public void setId_repoGas(int id_repoGas) {
		this.id_repoGas = id_repoGas;
	}

	public Calendar getFechaLlenado() {
		return fechaLlenado;
	}

	public void setFechaLlenado(Calendar fechaLlenado) {
		this.fechaLlenado = fechaLlenado;
	}

	public double getLitrosRepostados() {
		return litrosRepostados;
	}

	public void setLitrosRepostados(double litrosRepostados) {
		this.litrosRepostados = litrosRepostados;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public String getMd_uuid_repoGas() {
		return md_uuid_repoGas;
	}

	public void setMd_uuid_repoGas(String md_uuid_repoGas) {
		this.md_uuid_repoGas = md_uuid_repoGas;
	}


	//Constructores
	public RepostajeGas(int id_repoGas, Calendar fechaLlenado, double litrosRepostados, double coste,
			String tipoCombustible, String md_uuid_repoGas) {
		super();
		this.id_repoGas = id_repoGas;
		this.fechaLlenado = fechaLlenado;
		this.litrosRepostados = litrosRepostados;
		this.coste = coste;
		this.tipoCombustible = tipoCombustible;
		this.md_uuid_repoGas = md_uuid_repoGas;
	}
	
	public RepostajeGas(int id_repoGas, Calendar fechaLlenado, double litrosRepostados, double coste,
			String tipoCombustible) {
		super();
		this.id_repoGas = id_repoGas;
		this.fechaLlenado = fechaLlenado;
		this.litrosRepostados = litrosRepostados;
		this.coste = coste;
		this.tipoCombustible = tipoCombustible;
		this.md_uuid_repoGas = this.md_uuid_repoGas;

	}
	
	public RepostajeGas() {
		super();
	}
	
}
