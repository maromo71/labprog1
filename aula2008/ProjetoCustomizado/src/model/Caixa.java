package model;

import exception.CaixaException;

public class Caixa {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) throws CaixaException{
        if(valor > saldo) throw new CaixaException(111);
        saldo -= valor;
    }
    public double getSaldo() {
        return saldo;
    }
}
