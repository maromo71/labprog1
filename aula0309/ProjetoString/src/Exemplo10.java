import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome completo");
        String nomeCompleto = sc.nextLine();
        int posicao = nomeCompleto.lastIndexOf(" ") + 1;
        String sobrenome = nomeCompleto.substring(posicao);
        System.out.println("Sobrenome: " + sobrenome);
    }
}
