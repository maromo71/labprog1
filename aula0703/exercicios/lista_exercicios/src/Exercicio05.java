import java.util.Scanner;
import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Digite seu nome completo: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        String nickname = "";
        for (String name : names) {
            nickname += name.charAt(0);
        }
        nickname = nickname.toLowerCase() + random.nextInt(100);

        System.out.println("Seu nickname é: " + nickname);
    }
}

