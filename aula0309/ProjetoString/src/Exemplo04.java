public class Exemplo04 {
    public static void main(String[] args) {
        String msg1 = "Brasil terra de oportunidades";
        String msg2 = "Brasil perdeu a copa";
        boolean resultado = msg1.regionMatches(0, msg2, 0, 6);
        System.out.println(resultado);
    }
}
