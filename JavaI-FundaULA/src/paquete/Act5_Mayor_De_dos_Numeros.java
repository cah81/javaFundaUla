package paquete;

public class Act5_Mayor_De_dos_Numeros {

	public static void main(String[] args) {
		/*
		 * Actividad 5. Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor
		de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que
		funciona.

		 * 
		 * 
		 * 
		 */
		 int num1= 20, num2=20;
		 if(num1>num2) {
			 System.out.println("El numero 1 :" + num1 + " es mayor que numero 2  :" + num2 );
		 }else if(num1<num2) {
			 System.out.println("El numero 2 :" + num2 + " es mayor que numero 1 :" +num1);
		 }else if(num1==num2) {
			 System.out.println(" Los dos numeros son iguales " +num1+ " = " +num2 );
		 }
		
	}

}
