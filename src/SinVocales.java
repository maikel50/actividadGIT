import java.util.*;
public class SinVocales {
public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Introduce una palabra");
	String string = sc.next();
	string = string.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(string);
}
}
