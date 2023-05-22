import java.util.Scanner;

public class Principal {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		contarConsonantes();
		System.out.println("Dime una palabra que le vamos a quitar las vocales jeje");
		String palabrita = "";
		palabrita = sc.next();
		SinVocales(palabrita);
		
	}

	public static void contarConsonantes() {
		System.out.println("Escriba la frase");
		String frase = sc.next() ;
		NumeroConsonantes consonante = new NumeroConsonantes(frase);
		int cantidad = consonante.contarConsonantes();
		System.out.println("La frase tiene " + cantidad + " consonantes");
	}
	

}
