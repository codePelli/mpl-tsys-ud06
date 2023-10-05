package Ej09;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Inserta el tamano del array"));
		int[] array = new int[tamano];
		
		tamanoUsuario(array);
		print(array);
		
	}

	private static void tamanoUsuario(int[] array) {
		
		Random rnd = new Random();
		
		for (int x = 0; x < array.length; x++) {
			
			array[x] = rnd.nextInt(9);
		}
	}

	private static void print(int[] array) {
		
		String valores = "Los valores del array son: ";
		
		for (int x = 0; x < array.length; x++) {
			
			valores = valores + array[x];

		}
		
		JOptionPane.showMessageDialog(null, valores);
	}

}
