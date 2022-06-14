package paquete;
import java.util.*;
public class Act1_Leer_Numero_teclado {

	public static void main(String[] args) {
		/*
		 * Actividad 1. Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,
			también debemos indicarlo
		 * 
		 * 
		 */
			Scanner teclado = new Scanner(System.in);
			
			int numero;
			
			System.out.println("Introduzca numero");
			numero = teclado.nextInt();
			
			if(numero%2==0) {
				System.out.println("El numero es divisible entre dos " + " Su valor es : " +  numero);
				
			}else {
				System.out.println("El numero no es divisible entre dos " + " Su valor es : "  + numero );
				
			}
			
			
	}

}
