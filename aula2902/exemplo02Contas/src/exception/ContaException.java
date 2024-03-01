package exception;

public class ContaException  extends Exception{
    private int codigoErro;

    public ContaException(int codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        switch (codigoErro){
            case 1:
                return "Valor do depósito inválido";
            case 2:
                return "Sem saldo para o saque";
        }
        return "";
    }
}
