import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String firstString = scanner.nextLine();
        System.out.print("Digite a segunda string: ");
        String secondString = scanner.nextLine();

        if (firstString.length() == secondString.length()) {
            System.out.println("As strings são do mesmo tamanho.");
        } else {
            System.out.println("As strings têm tamanhos diferentes.");
        }
    }
}
