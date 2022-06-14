package paquete;

import java.util.Scanner;

public class Act8_Numero_Mostrar_Cifras {

	public static void main(String[] args) {
		/*Actividad 8. Pide por teclado un número entero positivo (debemos controlarlo) y muestra el
		número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
		Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.*/
		
		Scanner sc = new Scanner(System.in);
		int numero, contador=0;
		do {
			System.out.println("Ingresar numero");
			numero = sc.nextInt();
			
			System.out.println("numero ingresado " + numero);
			
			
		}while(numero<0);for(int i=numero;i>0;i/=10) 
			{
				
					//incrementar contador);
					contador++;
			 
			}
		
		//controlamos en el caso de que haya una sola cifra
		if(contador==1) {
			System.out.println("el numero " + numero + " tiene " + contador + " cifra");
		}else {
			System.out.println("el numero " + numero + " tiene " +contador+ " cifras");
		}
	}

}
