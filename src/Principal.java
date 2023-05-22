import java.util.*;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	String palabra;
        // Ejemplo de uso de las clases
    	System.out.println("Ponme una palabra contar las consonantes");
    	palabra = sc.next();
        NumeroConsonantes contadorConsonantes = new NumeroConsonantes(palabra);
        int cantidadConsonantes = contadorConsonantes.contarConsonantes();
        System.out.println("Cantidad de consonantes: " + cantidadConsonantes);

        System.out.println("Dime otra palabra para quitar las vocales");
        palabra = sc.next();
        SinVocales sinVocales = new SinVocales(palabra);
        String fraseSinVocales = sinVocales.quitarVocales();
        System.out.println("Palabra sin vocales: " + fraseSinVocales);
    }
}