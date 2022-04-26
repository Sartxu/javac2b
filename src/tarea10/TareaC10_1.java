package tarea10;

import javax.swing.JOptionPane;

public class TareaC10_1 {
	
	public static void tablasmultiplicar() {
		String mensajefin = "";
		Object [] selector ={"1","2","3","4","5","6","7","8","9","10"};
		Object seleccionado = JOptionPane.showInputDialog(
				null,
				"¿Que tabla quieres mostrar?",
				"Elegir",
				JOptionPane.QUESTION_MESSAGE,
				null,
				selector,
				selector[0]);
		String seleccionadostr = seleccionado.toString();
	
		for (int i = 0; i < 10 ; i++) {			
			int tablas = Integer.parseInt(seleccionadostr)* (i+1);
			
			String mensaje = (i+1) + " * " + seleccionado + " = "  + Integer.toString(tablas) + "\n";
			mensajefin += mensaje;
			
			
		}
		JOptionPane.showMessageDialog(null, mensajefin);
		
		
		
		
	
		
		
		
		
		
	}

}
