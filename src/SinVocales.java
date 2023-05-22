public class SinVocales {
    private String frase;

    public SinVocales(String frase) {
        this.frase = frase;
    }

    public String quitarVocales() {
        frase = frase.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(frase);
        return frase;
    }
}
