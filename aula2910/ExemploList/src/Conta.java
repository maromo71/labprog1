import java.time.LocalDateTime;

public class Conta {
    public int numero;
    public String nomeCliente;
    public double saldo;
    public LocalDateTime dataCadastro;

    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.dataCadastro = LocalDateTime.now();
    }

}
