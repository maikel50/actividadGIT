import java.util.*;
public class SinVocales{
public static Scanner sc = new Scanner(System.in);


public SinVocales(String palabrita){
	palabrita = palabrita.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(palabrita);
}

}
