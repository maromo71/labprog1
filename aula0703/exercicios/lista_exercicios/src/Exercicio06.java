//Tentando advinhar a posicao que inicia a palavra
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String hiddenWord = "desenvolvimento";
        String string = "Aprendendo Java é essencial para o desenvolvimento de aplicações modernas.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("String: " + string);
        System.out.print("Adivinhe a posição inicial da palavra escondida: ");
        int guess = scanner.nextInt();

        if (string.substring(guess).startsWith(hiddenWord)) {
            System.out.println("Parabéns! Você encontrou a palavra escondida.");
        } else {
            System.out.println("Tente novamente.");
        }
    }
}
