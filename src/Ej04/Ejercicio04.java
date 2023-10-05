package Ej04;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Inserta un numero");
		double numero = Double.parseDouble(num);
		
		double resultado = factorial(numero);
		
		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es " + resultado);

	}

	private static double factorial(double numero) {
		
		double resultado = 1;
		
		for (int x = 1; x <= numero; x++) {
		
			resultado = resultado * x;
		}
		
		return resultado;
	}

}
