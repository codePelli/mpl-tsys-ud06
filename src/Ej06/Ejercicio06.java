package Ej06;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog(null, "Inserta un numero");
		
		int numero = Integer.parseInt(num);
				
		int contador = cifras(numero);
		JOptionPane.showMessageDialog(null, "El numero de cifras de " + num + " es " + contador);

	}

	public static int cifras(int numero) {
		
		int cifra = 0;
		
		while (numero != 0) {
			
			numero = numero / 10;
			cifra++;
		}
		
		return cifra;

	}

}
