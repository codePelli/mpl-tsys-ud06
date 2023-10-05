package Ej01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		String circulo = "circulo";
		String cuadrado = "cuadrado";
		String triangulo = "triangulo";
		String figura = JOptionPane.showInputDialog(null, "Introduce circulo, cuadrado o triangulo:");

		if (figura.equals(circulo)) {
			circulo();
		}else if (figura.equals(cuadrado)){
			cuadrado();
		}else {
			triangulo();
		}
		
	}

	public static void circulo() {
			
		String circ = JOptionPane.showInputDialog(null, "Introduce el radio del circulo:");
			
		double radio = Double.parseDouble(circ);
		double area = Math.PI * Math.pow(radio, 2);
			
		JOptionPane.showMessageDialog(null, "El area del circulo es:  " + area);
			
	}
	
	private static void triangulo() {
		
		String base1 = JOptionPane.showInputDialog(null, "Introduce la base del triangulo: ");
		String alt1 = JOptionPane.showInputDialog(null, "Introduce la altura del triangulo:");
		
		double base = Double.parseDouble(base1);
		double alt = Double.parseDouble(alt1);
		
		double area = (base * alt) / 2;
			
		JOptionPane.showMessageDialog(null, "El area del triangulo es:  " + area);
		
	}

	private static void cuadrado() {
		
		String lado = JOptionPane.showInputDialog(null, "Introduce el lado:");
		String otroLado = JOptionPane.showInputDialog(null, "Introduce el otro lado:");
		
		double lado1 = Double.parseDouble(lado);
		double lado2 = Double.parseDouble(otroLado);
		
		double area = lado1 * lado2;
			
		JOptionPane.showMessageDialog(null, "El area del cuadrado es:  " + area);
		
	}

}