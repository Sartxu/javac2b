package tarea10;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué ejercicio quieres ejecutar?");
		byte selector = sc.nextByte();
		switch (selector) {
		case 1:
			
			TareaC10_1.tablasmultiplicar();
			
			
			break;
		case 2:
			
			Tareac10_2.factorial();
		
			break;
		case 3:
			
			TareaC10_3.contadorwhile();
			
			break;
		case 4:
			TareaC10_4.par();
			
			break;
		case 5:
		
			Tarea10C_5.primos();
			break;
		case 6:
			TareaC10_6.millas();
			
			break;
			
			
		
	
		
		
		
			
		
			
		
			
		

		
		
		
	}
		sc.close();}}




