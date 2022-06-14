package paquete;

import java.util.Scanner;

public class Act6_Numero_Mayor_IgualaCero {

	public static void main(String[] args) {
		/*
		 * Actividad 6. Lee un número por teclado y comprueba que este número es mayor o igual que
			cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
		 */
		int numero;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese el numero por teclado");
			numero = sc.nextInt();
			
			
		}while(numero>=0);
		System.out.println(" El numero ingresado fue " + numero);
		
		
	}

}
