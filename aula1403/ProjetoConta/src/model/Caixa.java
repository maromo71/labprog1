package model;

public class Caixa {
    private double saldo;

    //métodos sacar e depositar
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
