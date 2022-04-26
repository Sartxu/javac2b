package tarea10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TareaC10_4 {
	
	public static void par() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para saber si es par o impar");
		int num = sc.nextInt();
		
	if (num % 2 == 0) {
		System.out.println(num + " es par");
	}
	else {
		System.out.println(num + " es impar");
	}
		sc.close();
		
		
		
		
		
	}

}
