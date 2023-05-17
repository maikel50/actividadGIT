
public class NumeroConsonantes {
	private String frase;

    public NumeroConsonantes(String frase) {
        this.frase = frase;
    }

    public int contarConsonantes() {
        int contador = 0;
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (consonantes.indexOf(caracter) != -1) {
                contador++;
            }
        }

        return contador;
    }
}
