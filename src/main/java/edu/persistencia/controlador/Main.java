package edu.persistencia.controlador;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import edu.persistencia.consultas.Consultas;
import edu.persistencia.dal.Factura;
import edu.persistencia.dal.Normal;
import edu.persistencia.dal.RepostajeGas;
import edu.persistencia.dto.DAOaDTO;
import edu.persistencia.dto.DTOaDAO;
import edu.persistencia.dto.FacturaDTO;
import edu.persistencia.dto.NormalDTO;
import edu.persistencia.dto.RepostajeGasDTO;
import edu.persistencia.menu.Menu;

//Controlador que gestiona la comunicacion entre modelo y vista
@Controller
public class Main {

	public static void main(String[] args) {
				
		//Definimos el contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		//Sacamos la fecha
		Calendar fecha = Calendar.getInstance();
		
		//Scaner para iniciar la captura del valor
		Scanner scan = new Scanner(System.in);
		
		//Variables para el menu
		Menu m = new Menu();
		int opcion = 0;
		
		//Variable para paso de DTO a DAO
		DTOaDAO dtoAdao = new DTOaDAO();
		DAOaDTO daoAdto = new DAOaDTO();
		
		do {			
			//Mostramos el menu, introducimos el scan y guardamos la opcion seleccionada
			opcion = m.mostrarMenu(scan);
			
			//Opciones del programa
			switch (opcion) {
			
			//Insertamos un repostaje Normal
			case 1:
				NormalDTO normalito = new NormalDTO(25, fecha, 35);
				consulta.insertaRepostajesNormales(dtoAdao.normalDTOaDAO(normalito));
				System.out.println("Inserccion Normal Realizada!!!");
				
				break;
			
			//Insertamos un repostaje Factura
			case 2: 
				FacturaDTO facturita = new FacturaDTO(5, fecha, 45, "Probando", "Probando");			
				consulta.insertaRepostajesFacturas(dtoAdao.facturaDTOaDAO(facturita));
				System.out.println("Inserccion de Factura Realizada!!!!!");
				
				break;
			
			//Consulta de todos los repostajes
			case 3:
				
				System.out.println("Listado de Repostajes Facturados:");
				for (Factura fac : consulta.todoslosRepostagesFacturados()) {
					FacturaDTO facDTO = daoAdto.facturaDAOaDTO(fac);
					System.out.println(facDTO.toString());
				}
				
				System.out.println("Listado de Repostajes Normales:");
				for (Normal norm : consulta.todoslosRepostagesNormales()) {
					NormalDTO normDTO = daoAdto.normalDAOaDTO(norm);
					System.out.println(normDTO.toString());
				}
				
				System.out.println("Listado de Repostajes de la Gasolinera:");
				for (RepostajeGas gas : consulta.todoslosRepostagesGasolinera()) {
					RepostajeGasDTO gasDTO = daoAdto.repostGasDAOaDTO(gas);
					System.out.println(gasDTO.toString());
				}
				
				break;
			
			//Calculo total del combustible vendido
			case 4:
				consulta.importeTotalCombultible();
				
				break;
				
			case 5:
				RepostajeGasDTO repostaje = new RepostajeGasDTO(1, fecha, 150, 550.50, "Sin plomo 95");
				consulta.insertaRepostajesGasolinera(dtoAdao.repostGasDTOaDAO(repostaje));
				System.out.println("Inserccion de Repostaje Realizado!!!!!");
				
				break;
				
			case 6:
				consulta.borraUltimoLlenado();
				System.out.println("Ultimo Regitro de Repostaje en la Gasolinera Borrado!!!");
				
				break;
			default:
				break;
			}
			
			System.out.println();
			
		}while(opcion != 0);

	}

}
