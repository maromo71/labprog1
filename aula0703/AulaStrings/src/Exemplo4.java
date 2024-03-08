public class Exemplo4 {
    public static void main(String[] args) {
        String texto = "Mogi Mirim tem Faculdades Antigas";
        int posicao = texto.indexOf("Faculdades");

        System.out.println(posicao);
        String resultado =texto.substring(texto.indexOf("Faculdades"));

        System.out.println(texto.contains("Faculdadex"));
        System.out.println(resultado);

    }
}
