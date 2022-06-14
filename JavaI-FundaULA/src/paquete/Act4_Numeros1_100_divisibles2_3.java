package paquete;

import java.util.Scanner;

public class Act4_Numeros1_100_divisibles2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Muestra los números del 1 al 100 (ambos incluidos) divisibles por 2 o por 3. Utiliza
		//el bucle que desees.
		
		for(int i = 1 ;i<=100;i++) {
			
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
			
		

		
	}

}
