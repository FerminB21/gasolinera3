package edu.persistencia.dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Service;

//DTO correspondiente a los Repostajes de la gasolinera
@Service
public class RepostajeGasDTO {
	
		//Atributos
		private int id_repoGas;
		
		private Calendar fechaLlenado;
		
		private double litrosRepostados;
		
		private double coste;
		
		private String tipoCombustible;


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


		//Constructores
		public RepostajeGasDTO(int id_repoGas, Calendar fechaLlenado, double litrosRepostados, double coste,
				String tipoCombustible) {
			super();
			this.id_repoGas = id_repoGas;
			this.fechaLlenado = fechaLlenado;
			this.litrosRepostados = litrosRepostados;
			this.coste = coste;
			this.tipoCombustible = tipoCombustible;
		}
		
		public RepostajeGasDTO(Calendar fechaLlenado, double litrosRepostados, double coste,
				String tipoCombustible) {
			super();
			this.id_repoGas = this.id_repoGas;
			this.fechaLlenado = fechaLlenado;
			this.litrosRepostados = litrosRepostados;
			this.coste = coste;
			this.tipoCombustible = tipoCombustible;
		}

		public RepostajeGasDTO() {
			super();
		}
		
		//ToString
		@Override
		public String toString() {
			return "RepostageGasDTO [id_repoGas=" + id_repoGas + ", fechaLlenado=" + fechaLlenado.getTime()
					+ ", litrosRepostados=" + litrosRepostados + ", coste=" + coste + ", tipoCombustible="
					+ tipoCombustible + "]";
		}

}
