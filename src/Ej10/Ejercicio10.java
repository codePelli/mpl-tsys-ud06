package Ej10;

import java.util.Random;

import javax.swing.JOptionPane;

	public class Ejercicio10 {

	public static void main(String[] args) {

    	int tamano = Integer.parseInt(JOptionPane.showInputDialog("Inserta el tamaño del array"));
    	int[] array = new int[tamano];

    	arrayPrimo(array);
    	print(array);
    	
	}

	private static void arrayPrimo(int[] array) {
		
    	Random rnd = new Random();

    	for (int x = 0; x < array.length; x++) {
    		
        	array[x] = numAleatorio(rnd);
        	
    	}
	}

	private static int numAleatorio(Random rnd) {
		
	    int primoAleatorio = 0;
	    boolean numPrimo = false;

	    while (!numPrimo) {
	    	
	        primoAleatorio = rnd.nextInt(9);
	        numPrimo = esPrimo(primoAleatorio);
	        
	    }

	    return primoAleatorio;
	}

	private static boolean esPrimo(int numero) {
		
    	if (numero <= 1) {
    		return false;
    		
    	}
    	
    	for (int x = 2; x <= Math.sqrt(numero); x++) {
    	
        	if (numero % x == 0) {
        		return false;
        	}
    	}
    	
    	return true;
	}

	private static void print(int[] array) {
		
		String valores = "Los valores son: ";

		for (int x = 0; x < array.length; x++) {
			valores = valores + array[x];

		}

		JOptionPane.showMessageDialog(null, valores);
	}
	
}
