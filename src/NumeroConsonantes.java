public class NumeroConsonantes {
    private String frase;

    public NumeroConsonantes(String frase) {
        this.frase = frase;
    }

    public int contarConsonantes() {
        int contador = 0;
        String frasecita = frase.replaceAll(" ", "");

        for (int i = 0; i < frasecita.length(); i++) {
            char caracter = Character.toLowerCase(frasecita.charAt(i));
            if (Character.isLetter(caracter) && !"aeiou".contains(String.valueOf(caracter))) {
                contador++;
            }
        }

        return contador;
    }
}
