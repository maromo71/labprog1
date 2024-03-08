public class Exemplo3 {
    public static void main(String[] args) {
        String m1 = "Buscam a bola";
        String m2 = "Buscar o giz";

        boolean resultado = m1.regionMatches(0, m2, 0, 5);
        System.out.println(resultado);
    }


}
