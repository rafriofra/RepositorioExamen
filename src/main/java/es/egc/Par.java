package es.egc;

/**
 * PAR
 *
 */
public class Par {

	public static boolean esPar(int numero){
		boolean res;
		if (numero%2==0){
			res = true;
			System.out.println("El n�mero es par");
		}else{
			res = false;
			System.out.println("El n�mero es impar");
		}
		return res; 
	}
}
