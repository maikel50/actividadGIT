
public class SinVocales{

private String palabrita;


public String getPalabrita() {
	return palabrita;
}


public void setPalabrita(String palabrita) {
	this.palabrita = palabrita;
}


public SinVocales(String palabrita){
	this.palabrita = palabrita.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(palabrita);
}

}
