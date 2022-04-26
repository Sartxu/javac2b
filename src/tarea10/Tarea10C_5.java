package tarea10;

public class Tarea10C_5 {

	public static void primos() {

	int cota1 = 1;
	int cota2 = 1000;

	for (int x = cota1; x <= cota2; x++) {
	if (esPrimo(x)) {
	System.out.println(x + "Es primo");
	} else {
	System.out.println(x + "no es primo");
	}

	}

	}

	public static boolean esPrimo(int numero) {


	int contador = 2;
	boolean primo = true;
	while ((primo) && (contador != numero)) {
	if (numero % contador == 0)
	primo = false;
	contador++;
	}

	return primo;

	}

}
