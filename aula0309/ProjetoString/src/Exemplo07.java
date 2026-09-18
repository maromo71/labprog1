import java.util.Scanner;

public class Exemplo07 {
    //Exemplos com indexOf e lastIndexOf
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto do seu paragraafo: ");
        String paragrafo = sc.nextLine();
        System.out.println("Digite a palavra a ser encontrada: ");
        String palavra = sc.nextLine();
        
        if(paragrafo.indexOf(palavra)==-1){
            System.out.println("Palavra nao encontrada no texto");
        }else{
            System.out.println("Palavra encontrada");
            System.out.println("Inicia no caractere: ");
            System.out.println(paragrafo.indexOf(palavra));
        }
    }
}
