import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = scanner.nextLine();
        System.out.print("Digite a letra a ser contada: ");
        char letter = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("A letra '" + letter + "' aparece " + count + " vezes em " + word);
    }
}
