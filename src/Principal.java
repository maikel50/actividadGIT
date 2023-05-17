import java.util.Scanner;

public class Principal {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		contarConsonantes();
		
	}

	public static void contarConsonantes() {
		System.out.println("Escriba la frase");
		String frase = sc.next() ;
		NumeroConsonantes consonante = new NumeroConsonantes(frase);
		int cantidad = consonante.contarConsonantes();
		System.out.println("La frase tiene " + cantidad + " consonantes");
	}

}
