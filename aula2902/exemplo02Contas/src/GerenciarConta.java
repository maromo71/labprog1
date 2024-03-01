import exception.ContaException;
import model.Conta;

public class GerenciarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        try {
            conta1.depositar(5000.0);
            System.out.println(conta1.getSaldo());

            conta1.sacar(5900.0);
            System.out.println("Novo Saldo: " + conta1.getSaldo());
        } catch (ContaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}