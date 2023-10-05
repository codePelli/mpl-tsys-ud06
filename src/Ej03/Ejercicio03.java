package Ej03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Inserta un numero");
		int numero = Integer.parseInt(num);
		
		primo(numero);
		
		boolean muestra = primo(numero);
		
		if (muestra == true) {
			JOptionPane.showMessageDialog(null, "Es primo");
		} else {
			JOptionPane.showMessageDialog(null, "No es primo");
		}
		
	}

	private static boolean primo(int numero) {
		
		if (numero <= 1) {
			return false;
		}
		
		for (int x = 2; x <= Math.sqrt(numero); x++) {
			if (numero % x == 0) {
				return  false;
			}
		}
		
		return true;
		
	}

}
