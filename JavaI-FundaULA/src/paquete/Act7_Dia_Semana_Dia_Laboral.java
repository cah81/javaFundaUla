package paquete;

import java.util.Scanner;

public class Act7_Dia_Semana_Dia_Laboral {

	public static void main(String[] args) {
		/*
		 * Actividad 7. Crea una aplicación que nos pida un día de la semana y que nos diga si es un día
			laboral o no. Usa un switch para ello
		 * 
		 * 
		 */
		String dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el dia de la semana");
		dia = sc.next();
		switch (dia	) {
		
		case "lunes":
				
		case "Martes":
				
		case "miercoles":
			
		case "Jueves":
		
		case "viernes":
		
			System.out.println("Dia laboral");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Dia festivo");
			break;
			
		default:
			System.out.println("Ingrese el dia de la semana");
		
		
		
		
		
		
		
		
		
		}
	}

}
