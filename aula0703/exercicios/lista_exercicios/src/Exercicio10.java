import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do evento: ");
        String eventName = scanner.nextLine();

        String hashtag = "#" + eventName.replace(" ", "").toLowerCase();

        if (hashtag.length() > 120) {
            System.out.println("Hashtag é muito longa!");
        } else {
            System.out.println("A hashtag do evento é: " + hashtag);
        }
    }
}

