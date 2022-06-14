package paquete;

import javax.swing.JOptionPane;

public class Act1_Leer_Numero_Usando_String {

	public static void main(String[] args) {
		//Ahora usando otro metodo que no es el Scanner
		
		String texto = JOptionPane.showInputDialog("ingrese el texto");
		int numero = Integer.parseInt(texto);
		
		
		if(numero%2==0) {
			System.out.println(" el numero" + numero + " es divisible entre 2");
			
		}else {
			System.out.println("el numero " + numero  + " No es divisible entre 2 ");
		}

	}

}
