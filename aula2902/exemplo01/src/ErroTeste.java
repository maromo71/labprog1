import java.util.InputMismatchException;
import java.util.Scanner;

public class ErroTeste {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite um valor:");
            x = sc.nextInt();
            System.out.println("Digite outro valor:");
            y = sc.nextInt();
            int r = x / y;
            System.out.println("Resultado: " + r);
        }catch (InputMismatchException e){
            System.out.println("Tipo de dado inválido");
        }catch(ArithmeticException e){
            System.out.println("Nao pode dividir por 0");
        }catch (Exception e){
            System.out.println("Avise o adm, deu erro");
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("passei aqui com ou sem erro");
        }
    }
}
