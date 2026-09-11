package exception;

public class CaixaException extends Exception {
    private int erro;

    public CaixaException(int erro){
        this.erro = erro;
    }

    @Override
    public String getMessage() {
        if(erro==1){
            return "Sem saldo para a operacao";
        }
        return "";
    }
}
