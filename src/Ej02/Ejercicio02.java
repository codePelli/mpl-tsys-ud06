package Ej02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog(null, "¿Cuantos numeros quieres crear?");
		int numeros = Integer.parseInt(num);

		Random rnd = new Random();
		
		JOptionPane.showMessageDialog(null, "Numeros creados: ");
		
		for(int x = 0; x < numeros; x++) {
			int numRnd = rnd.nextInt();
			JOptionPane.showMessageDialog(null, numRnd);
		}

	}

}



