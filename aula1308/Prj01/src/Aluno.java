public class Aluno {
    //1. Definir os atributos
    private int ra;
    private String nome;
    private String email;
    private String turma;

    //2. gerar gets and sets
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
    public String getEmail() {
        return email;
    }
    public void setEmai(String email) {
        this.email= email;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    //3. gerar construtor
    public Aluno(int ra, String nome, String email, String turma) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.turma = turma;
    }

    //Metódos de negócios
    public void matricular(){
        System.out.println("Aluno matriculado com sucesso!");
        System.out.println("RA: " + this.ra + " Nome: " + this.nome);
    }

    public void cancelarMatricula(){
        System.out.println("Aluno cancelou a matrícula!");
        System.out.println("RA: " + this.ra + " Nome: " + this.nome);
    }
    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", email=" + email + ", turma=" + turma + "]";
    }

    
}
