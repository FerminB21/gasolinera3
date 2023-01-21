package edu.persistencia.consultas;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.persistencia.dal.Factura;
import edu.persistencia.dal.FacturaServicioImple;
import edu.persistencia.dal.Normal;
import edu.persistencia.dal.NormalServicioImple;
import edu.persistencia.dal.RepostageGasServicioImp;
import edu.persistencia.dal.RepostajeGas;

@Service
public class Consultas {
	
	@Autowired
	private NormalServicioImple nsi;
	
	@Autowired
	private FacturaServicioImple fsi;
	
	@Autowired
	private RepostageGasServicioImp rgi;
	
	
	@Transactional
	public void insertaRepostajesNormales(Normal normal) {
		nsi.insertaRepostaje(normal);
	}
	
	@Transactional
	public void insertaRepostajesFacturas(Factura factura) {
		fsi.insertaRepostaje(factura);
	}
	
	
	@Transactional
	public List<Normal> todoslosRepostagesNormales() {
		
		List<Normal> listadoRNormal = nsi.todosRepostajes();
		return listadoRNormal;
		
	}
	
	@Transactional
	public List<Factura> todoslosRepostagesFacturados() {
		
		List<Factura> listadoRFactura = fsi.todosRepostajes();
		return listadoRFactura;
		
	}
	
	@Transactional
	public List<RepostajeGas> todoslosRepostagesGasolinera() {
		
		List<RepostajeGas> listadoRGasolinera = rgi.todosRepostajes();
		return listadoRGasolinera;
		
	}
	
	
	@Transactional
	public void  importeTotalCombultible() {
		
		List<Normal> listadoRNormal = nsi.todosRepostajes();
		List<Factura> listadoRFactura = fsi.todosRepostajes();
		double importeTotal = 0;
		
		for (Factura factura : listadoRFactura) {
			importeTotal += factura.getPrecio_factura();
		}
		
		for (Normal normal : listadoRNormal) {
			importeTotal += normal.getPrecio_Normal();
		}
		
		System.out.println("El importe obtenido por todas las ventas es: " + importeTotal + "€.");
		
	}
	
	@Transactional
	public void insertaRepostajesGasolinera(RepostajeGas gasolinera) {
		rgi.llenadoDeposito(gasolinera);
	}
	
	@Transactional
	public void borraUltimoLlenado() {
		rgi.borraUltimoLlenado();
	}

}
