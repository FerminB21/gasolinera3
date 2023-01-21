package edu.persistencia.menu;

import java.util.Calendar;
import java.util.Scanner;

import edu.persistencia.dto.FacturaDTO;
import edu.persistencia.dto.NormalDTO;
import edu.persistencia.dto.RepostajeGasDTO;

public class Menu {

	//Método que muestra el menu y pregunta por la opción que quiera escoger
	public int mostrarMenu(Scanner scan) {
		
		int opcion;
		System.out.println("#################");
		System.out.println("##### MENU ######");
		System.out.println("#################");
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("4. Importe total combustible vendido");
		System.out.println("5. Llenado de deposito");
		System.out.println("6. Eliminar ultimo llenado de deposito");
		System.out.println("7. Ver todos los llenados de deposito");		
		System.out.println("0. Cerrar menu.");
		System.out.print("[INFO] - Escriba el numero de la opcion deseada: ");
        opcion = scan.nextInt();
		return opcion;
		
	}
	
	//Método para preguntar por el Repostaje Normal.
	public NormalDTO preguntaRepoNormal() {
		
		//Obtenemos fecha del momento del repostaje.
		Calendar fecha = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("\nOpción escogida Repostaje Normal.\n");
		System.out.printf("\nIndique la cantidad en euros € que desea repostar y pulse Intro: ");
		double cantidad = scan.nextDouble();
		
		return new NormalDTO(fecha, cantidad);
		
	}
	
	//Método para preguntar por el Repostaje Factura.
		public FacturaDTO preguntaRepoFactura() {
			
			//Obtenemos fecha del momento del repostaje.
			Calendar fecha = Calendar.getInstance();
			
			Scanner scan = new Scanner(System.in);
			
			System.out.printf("\nOpción escogida Repostaje Factura.\n");
			System.out.printf("\nIndique la cantidad en euros € que desea repostar y pulse Intro:");
			double cantidad = scan.nextDouble();
			
			System.out.printf("\nIndique su DNI y pulse Intro: ");
			String dni = scan.next();
			
			System.out.printf("\nIndique su Matrícula y pulse Intro: ");
			String matricula = scan.next();
			
			return new FacturaDTO(fecha, cantidad, dni, matricula);
			
		}
		
		//Método para preguntar por el Repostaje Factura.
		public RepostajeGasDTO preguntaRepostajeGas() {
					
			//Obtenemos fecha del momento del repostaje.
			Calendar fecha = Calendar.getInstance();
					
			Scanner scan = new Scanner(System.in);
					
			System.out.printf("\nOpción escogida Repostaje Factura.\n");
			System.out.printf("\nIndique los Litros Repostados y pulse Intro: ");
			double cantidad = scan.nextDouble();
					
			System.out.printf("\nIndique el coste del repotaje y pulse Intro:");
			double coste = scan.nextDouble();
			
			System.out.printf("\nIndique el tipo de combustible repostado y pulse Intro: \n");
			String[] tipoCombustible = {"Sin Plomo 95", "Sin Plomo 98", "Gasoil"};
			int combustSelect;
			
			do {
				
				for (int i = 0; i < tipoCombustible.length; i++) {
					System.out.println(" " + (i+1) + ") " + tipoCombustible[i]);
				}
				
				combustSelect = scan.nextInt();
				
			}while (combustSelect < 0 || combustSelect > tipoCombustible.length);			
			
			return new RepostajeGasDTO(fecha, cantidad, coste, tipoCombustible[combustSelect-1]);
					
		}
	
}
