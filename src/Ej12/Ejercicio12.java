package Ej12;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

    	System.out.println("Inserta el tamano del array: ");
    	int tamano = sc.nextInt();
    	
    	int[] array1 = new int[tamano];
    	int[] array2 = array1;
    	
    	rndArray(array1);
    	
    	System.out.println("Inserta el digito: ");
    	int dig = sc.nextInt();
    	
    	int[] numDig = numPorDig(array1, dig);
    	
    	printArray(numDig);

	}
	
	private static void printArray(int[] array) {
		
		System.out.println("Numero array: ");
		
		for (int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
		
	}
	
	private static int[] numPorDig(int[] array1, int dig) {
		
		return IntStream.of(array1).filter(numero -> numero % 10 == dig).toArray();
	}

	private static void rndArray(int[] array) {

		Random rnd = new Random();
		for (int x = 0; x < array.length; x++) {
			array[x] = rnd.nextInt(300);
		}
		
	}

}
