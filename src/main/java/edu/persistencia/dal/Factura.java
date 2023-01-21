package edu.persistencia.dal;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Clase con la entidad de repostajes Facturados
@Entity
@Table(name="factura", schema="dlk_gasolinera")
public class Factura {
	
	//Atributos
	//Al fijar la equiqueta @Id podemos quitar de bajo los atributos unique y nullable,
	//lo tendré en cuenta para las siguientes clases
	@Id
	//Autoincrementable
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_factura", unique = true, nullable = false) 
	private int id_factura;
	
	//Con columnDefinition definimos el valor por defecto 
	//(NO LO USO PORQUE DA ERRORES EN LA MIGRACION, MEJOR FIJAR VALORES POR DEFECTO IGULANDOLOS)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "md_date_factura", nullable = false) 
	private Calendar md_date_factura = new GregorianCalendar(2023, 12, 31, 23, 59);
	
	@Column(name = "precio_factura", nullable = false) 
	private double precio_factura = 0;
	
	@Column(name = "dni", nullable = false) 
	private String dni = "No Informado";
	
	@Column(name = "matricula", nullable = false) 
	private String matricula = "No Informado";
	
	@Column(name = "md_uuid_Factura", nullable = true)
	private String md_uuid_Factura = "No Informado";

	
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

	public String getMd_uuid_Factura() {
		return md_uuid_Factura;
	}

	public void setMd_uuid_Factura(String md_uuid_Factura) {
		this.md_uuid_Factura = md_uuid_Factura;
	}


	//Constructores
	public Factura(int id_factura, Calendar md_date_factura, double precio_factura, String dni,
			String matricula, String md_uuid_Factura) {
		super();
		this.id_factura = id_factura;
		this.md_date_factura = md_date_factura;
		this.precio_factura = precio_factura;
		this.dni = dni;
		this.matricula = matricula;
		this.md_uuid_Factura = md_uuid_Factura;
	}
	
	public Factura(int id_factura, Calendar md_date_factura, double precio_factura, String dni,
			String matricula) {
		super();
		this.id_factura = id_factura;
		this.md_date_factura = md_date_factura;
		this.precio_factura = precio_factura;
		this.dni = dni;
		this.matricula = matricula;
		this.md_uuid_Factura = this.md_uuid_Factura;

	}

	public Factura() {
		super();
	}

}
