import java.util.*;
public class SinVocales{
public static Scanner sc = new Scanner(System.in);


public static String SinVocales(String palabrita){
	palabrita = palabrita.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(palabrita);
	return palabrita;
}

}
