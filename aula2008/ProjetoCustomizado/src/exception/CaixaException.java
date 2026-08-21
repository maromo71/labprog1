package exception;

public class CaixaException extends Exception {

    private int cod_erro;
    public CaixaException(int cod_erro){
        this.cod_erro = cod_erro;
    }

    @Override
    public String getMessage() {
        if(cod_erro == 111){
            return "Sem disponivel saldo para o saque";
        }
        return "";
    }
}
