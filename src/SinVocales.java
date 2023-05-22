
public class SinVocales{



public static String obtenerSinVocales(String palabrita){
	palabrita = palabrita.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(palabrita);
	return palabrita;
}

}
