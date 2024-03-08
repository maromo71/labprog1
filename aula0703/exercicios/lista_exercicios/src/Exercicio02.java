import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = scanner.nextLine();

        StringBuffer reversed = new StringBuffer(word);
        reversed.reverse();

        System.out.println("A palavra reversa é: " + reversed);
    }
}
