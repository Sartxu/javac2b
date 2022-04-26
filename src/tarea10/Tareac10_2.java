package tarea10;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Tareac10_2 {
	
	public static void factorial() {
		String mensaje = "";
		String teclado = JOptionPane.showInputDialog("Introduce un numero para conocer su factorial");
		int num = Integer.parseInt(teclado);

		for (int i = 1; i <=num ; i++) {
			
			int factorial = num * i;
			mensaje = Integer.toString(factorial);
			
		}
		JOptionPane.showMessageDialog(null, mensaje);
	
		
	}
	

}
