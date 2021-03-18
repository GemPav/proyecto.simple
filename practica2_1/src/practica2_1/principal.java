package practica2_1;
import java.util.Scanner;

/**
 * Clase conun menú que accede a ciertos métodos con los que se realizan diferentes acciones.
 * @version 1, 17/03/2021
 * @author Gemma Pavón
 * @see ejercicios#esPar(int) 
 * @see ejercicios#multiplicacion(int) 
 * @see ejercicios#numeroCifras(int) 
 **/

public class principal{

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
		int opcion;
		int lineas=10;
   		do { 
   		 
   		 System.out.println("Menu");
   		 System.out.println("----");
   		 System.out.println("1. ¿Es par el número?");
   		 System.out.println("2. ¿Es cociente par el cociente de la división del mayor entre el menor?");
   		 System.out.println("3. ¿Número de cifras del menor");
   		 System.out.println("0. Salir");
   		 
   		 System.out.println("Dime una opción: ");
   		 opcion= sc.nextInt();
   		 sc.nextLine();
   		 
   		
   		 if (opcion<0 || opcion>3) {
   			 System.out.println("Opción incorrecta"); 
   			 ejercicios.limpiar(lineas);
   		 }
   		 
   		 
   	 
			 switch (opcion) {
			 	   case 1:{
			 			Scanner scan = new Scanner(System.in);
			 			System.out.println("Dime un número y te diré si es par o no");
			 			int num1 = scan.nextInt();
			 			ejercicios.esPar(num1);
			 			scan.close();
			 			
			 		}
				 
			 
			 	   case 2:{
			 		    Scanner scan2 = new Scanner(System.in);
			 		    System.out.println("Dime un número y lo multiplicaré por símismo");
			 		    int num2 = scan2.nextInt();
			 		    ejercicios.multiplicacion(num2);
			 		    scan2.close();
			 		   
			 	   }
				 
		
			 	   case 3:{
			 		    Scanner scan3 = new Scanner(System.in);
			 		    System.out.println("Dime un número y te diré el número de cifras que tiene:");
			 		    int num3 = scan3.nextInt();
			 		    scan3.close();
			 		    ejercicios.numeroCifras(num3);
			 		   
			 	   }
				 
			 	  
			 }
			 
   	 	 
    }while(opcion!=0); sc.close(); return; 
   	 
}

}
