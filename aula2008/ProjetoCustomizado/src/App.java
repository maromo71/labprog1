import exception.CaixaException;
import model.Caixa;

public class App {
    public static void main(String[] args)  {
        Caixa caixa = new Caixa();
        caixa.depositar(1000);
        
        try {
            caixa.sacar(1800);
        } catch (CaixaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo atual: " + caixa.getSaldo());
    }
}
