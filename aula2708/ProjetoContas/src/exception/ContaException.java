package exception;

public class ContaException extends Exception{
    private int codErr;

    public ContaException(int codErr){
        this.codErr = codErr;
    }
    //Tratamento
    @Override
    public String getMessage() {
        if(codErr == 1){
            return "Sem saldo para o saque";
        }else if(codErr == 2){
            return "Valor invalido para deposito";
        }else{
            return "Erro indefinido. Contate o Administrador";
        }
    }
}
