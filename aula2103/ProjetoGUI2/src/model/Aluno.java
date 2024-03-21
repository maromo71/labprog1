package model;

public class Aluno {
    private int ra;
    private String nome;
    private String turma;
    private String email;

    public Aluno(int ra, String nome, String turma, String email) {
        this.ra = ra;
        this.nome = nome;
        this.turma = turma;
        this.email = email;
    }
    public Aluno(){

    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
