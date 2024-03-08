import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um e-mail: ");
        String email = scanner.nextLine();

        boolean isValid = email.contains("@") && email.endsWith(".com");

        System.out.println("O e-mail " + (isValid ? "é válido" : "não é válido"));
    }
}
