package Ej05;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Inserta un numero");
		int numero = Integer.parseInt(num);
		
		String resultado = binario(numero);
		
		JOptionPane.showMessageDialog(null, "El binario de " + num + " es " + resultado);

	}

	private static String binario(int numero) {
		
		String resultado = "";
		
		while (numero > 0) {
			
			int nume = numero % 2;
			resultado = nume + resultado;
			numero = numero / 2;
			
			
		}
		
		return resultado;
	}

}
