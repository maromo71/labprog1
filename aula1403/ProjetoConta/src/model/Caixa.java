package model;

public class Caixa {
    private double saldo;

    //métodos sacar e depositar
    public void depositar(double valor){
        if(valor <=0){
            throw new IllegalArgumentException("Valor " +
                    "inválido para depósito");
        }
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor > saldo){
            throw new IllegalArgumentException("Sem saldo" +
                    " suficiente para o saque");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
