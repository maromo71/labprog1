import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        String x = "Marcos";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para y: ");
        String y = sc.nextLine();

        if(x.equalsIgnoreCase(y)){
            System.out.println("Sao iguais");
        }else{
            System.out.println("Sao diferentes");
        }
    }
}
