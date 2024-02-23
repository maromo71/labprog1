package model;

/**
 * Classe Cliente
 * @author Maromo
 * @since fev 2024
 */
public class Cliente {
    private int codigo;
    private String nome;
    private double salario;

    @Override
    public String toString() {
        return "Dados do Cliente: \n" +
                "Código: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Salário R$ " + salario + "\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
