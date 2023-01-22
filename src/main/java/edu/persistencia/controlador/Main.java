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

//Controlador que gestiona la comunicación entre modelo y vista
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
			System.out.println();
			
			//Mostramos el menu, introducimos el scan y guardamos la opción seleccionada
			opcion = m.mostrarMenu(scan);
			
			//Opciones del programa
			switch (opcion) {
			
			//Opción para insertar un repostaje Normal
			case 1:
				//Preguntamos por el repostaje
				NormalDTO repostNormal = m.preguntaRepoNormal();
				
				consulta.insertaRepostajesNormales(dtoAdao.normalDTOaDAO(repostNormal));
				System.out.println("Inserccion Normal Realizada!!!");
				
				break;
			
			//Opción para insertar un repostaje Factura
			case 2: 
				//Preguntamos por el repostaje
				FacturaDTO repostFactura = m.preguntaRepoFactura();
				
				consulta.insertaRepostajesFacturas(dtoAdao.facturaDTOaDAO(repostFactura));
				System.out.println("Insercción de Factura Realizada!!!!!");
				
				break;
			
			//Opción para consulta de todos los repostajes
			case 3:
				
				System.out.println("Listado de Repostajes Facturados:");
				System.out.println();
				for (Factura fac : consulta.todoslosRepostagesFacturados()) {
					FacturaDTO facDTO = daoAdto.facturaDAOaDTO(fac);
					System.out.println(facDTO.toString());
				}
				
				System.out.println("Listado de Repostajes Normales:");
				System.out.println();
				for (Normal norm : consulta.todoslosRepostagesNormales()) {
					NormalDTO normDTO = daoAdto.normalDAOaDTO(norm);
					System.out.println(normDTO.toString());
				}
				
				break;
			
			//Opción para cálculo total del combustible vendido
			case 4:
				consulta.importeTotalCombultible();
				
				break;
			
			//Opción para llenado de depósito: Insertar reposaje de gasolinera
			case 5:
				RepostajeGasDTO repostajeGas = m.preguntaRepostajeGas();
				consulta.insertaRepostajesGasolinera(dtoAdao.repostGasDTOaDAO(repostajeGas));
				System.out.println("Insercción de Repostaje Realizado!!!!!");
				
				break;
			
			//Opción para borrar último llenado de depósito de gasolinera
			case 6:
				consulta.borraUltimoLlenado();
				System.out.println("Último Regitro de Repostaje en la Gasolinera Borrado!!!");
				
				break;
			
			//Opción para ver todos los llenados de depósito de la gasolinera
			case 7:				
				System.out.println("Listado de Repostajes de la Gasolinera:");
				for (RepostajeGas gas : consulta.todoslosRepostagesGasolinera()) {
					RepostajeGasDTO gasDTO = daoAdto.repostGasDAOaDTO(gas);
					System.out.println(gasDTO.toString());
				}
				
				break;
				
			case 0:
				System.out.println("Ha cerrado la aplicación. Gracias por usarla.");
				
				break;
			
			//Opción en caso de que se introduzca una opción NO valida.
			default:				
				System.out.println("Opción no válida, escoja una Opción del [0 - 7] y pulse intro.");
				
				break;
			}
			
			System.out.println();
			
		}while(opcion != 0);

	}

}
