import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean executando = true;
        while (executando) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o primeiro valor: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o segundo valor: ");
                int b = Integer.parseInt(sc.nextLine());
                int resultado = a / b;
                System.out.println("Resultado: " + resultado);
                executando = false;
            } catch (NumberFormatException ex) {
                System.out.println("Erro: Entrada deve ser um número inteiro");
            } catch (ArithmeticException ex) {
                System.out.println("Não pode dividir por zero");
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
                System.out.println("Contate o Adm do Sistema");
            } finally {
                System.out.println("Passei aqui");
            }
        }

    }
}
