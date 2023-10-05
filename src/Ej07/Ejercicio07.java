package Ej07;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Inserta un numero de euros");
		double numero = Integer.parseInt(num);
		String moneda = JOptionPane.showInputDialog(null, "Inserta una moneda");
		
		conversor(numero,moneda);
		
		JOptionPane.showMessageDialog(null, "La conversion final es " + euros);
		
	}
	
	static double euros = 0;

	private static void conversor(double numero, String moneda) {
		
		double libra = 0.86;
		double dollar = 1.28611;
		double yen = 129.852;
		
		if (moneda.equals(libra)) {
			euros = libra * numero;
		} else if (moneda.equals(dollar)) {
			euros = dollar * numero;
		} else {
			euros = yen * numero;
		}
		

	}

}
