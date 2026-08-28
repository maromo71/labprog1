package model;

import exception.ContaException;

public class Conta {
    //Atributos
    private int numConta;
    private String nomeCliente;
    private String nomeAgencia;
    private double saldo;

    //Metodo construtor personalizado
    public Conta(int numConta, String nomeCliente, String nomeAgencia) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.nomeAgencia = nomeAgencia;
    }

    //Geramos todos e apagamos o setSaldo
    //Nao tem logica definir saldo da conta
    //sem fazer deposito ou retirada
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodos de negocios
    public void sacar(double valor) throws ContaException{
        if(valor > saldo) {
            throw new ContaException(1);
        }
        this.saldo -= valor;
    }
    public void depositar(double valor) throws ContaException{
        if(valor <= 0){
            throw new ContaException(2);
        }
        this.saldo += valor;
    }
    public void emitirSaldo(){
        System.out.println("------------------");
        System.out.println("Saldo corrente: ");
        System.out.println("R$ " + saldo);
        System.out.println("------------------");
    }

    //Gerar o método toString
    @Override
    public String toString() {
        return String.format("%6d | %-25s | %-15s | %8.2f", 
            numConta, nomeCliente, nomeAgencia, saldo);   
    }
}
