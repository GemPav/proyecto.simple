package practica2_1;

public class ejercicios {
    
    /**
     * Método para comprobar si el número introducido es par.
     * @param numero1 es el número a comprobar.
     * @return un valor booleano y si es par o no.
     **/
public static boolean esPar (int numero1){
    if (numero1%2==0) {
    	System.out.println("Es par"); 
    }
    else System.out.println("No es par");
    return false;
}
/**
 *  Método que realiza la multiplicación de un número multiplicado por si mismo.
 * @param numero2 es el número a multiplicar.
 * **/
public static void multiplicacion(int numero2) {
	int m;
    m=(numero2 * numero2);
    System.out.println("El n�mero multiplicado por s�mismo es: " + m);
    }



/**
 * Método que nos dice el número de cifras de un número.
 * @param numero3  es el número del cual sacaremos su número de cifras.
 * @return delvuelve el número de cifras.
 **/
public static int numeroCifras(int numero3){
    int cifras=0;
    while (numero3!= 0){
   			 numero3/=10;
   			 cifras++;
   	}
   	System.out.println("El n�mero de cifras es: " +cifras);
    return cifras;
}


/**
 * Método que limpia la pantalla
 **/
public static void limpiar(int lineas){
	for (int i=0; i < lineas; i++)
	{
			System.out.println();
	}
}




}
