import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = scanner.nextLine();

        String reversed = new StringBuffer(word).reverse().toString();
        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("A palavra " + (isPalindrome ? "é" : "não é") + " um palíndromo");
    }
}
