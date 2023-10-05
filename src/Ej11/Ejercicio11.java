package Ej11;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		
    	int tamano = Integer.parseInt(JOptionPane.showInputDialog("Inserta el tamaño del array 1"));
    	int[] array1 = new int[tamano];
    	int[] array2 = array1;
    	
    	rndArray(array1);
    	printArray(array1);
    	printArray(array2);
    	multArray(array1, array2);
    	printArray(array1);
    	printArray(array2);

	}

	private static void multArray(int[] array1, int[] array2) {

		for (int x = 0; x < array1.length; x++) {
			array1[x] = array1[x] * array2[x];
		}
		
	}
	
	private static void printArray(int[] array) {
		
		JOptionPane.showMessageDialog(null, "Numeros array: ");
		
		for (int x = 0; x < array.length; x++) {
			JOptionPane.showMessageDialog(null, array[x]);
		}
		
	}


	private static void rndArray(int[] array) {

		Random rnd = new Random();
		for (int x = 0; x < array.length; x++) {
			array[x] = rnd.nextInt(10);
		}
		
	}
	

	
	

}


