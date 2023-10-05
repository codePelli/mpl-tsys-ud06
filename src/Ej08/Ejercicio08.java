package Ej08;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		JOptionPane.showMessageDialog(null, "Inserta los 10 numeros del array");
		
		contador(array);
		print(array);
		
	}

	private static void contador(int[] array) {
		for (int x = 0; x < array.length; x++) {
			
			String num = JOptionPane.showInputDialog(null, "Inserta un numero");
			int numero = Integer.parseInt(num);
			array[x] = numero;
			
		}
	}

	private static void print(int[] array) {
		for (int x = 0; x < array.length; x++) {
			
			JOptionPane.showMessageDialog(null, "Los valores del array son: " + array[x]);
			
		}
	}

}
