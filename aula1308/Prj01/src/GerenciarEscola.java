import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEscola {
    //Atributo - Lista de Alunos (alunos)
    private List<Aluno> alunos = new ArrayList<>();

    //Metodo main
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        GerenciarEscola ge = new GerenciarEscola();
        int opcao = 0;
        do{
            System.out.println("Gerenciar Escola - Menu");
            System.out.println("1. Matricular Aluno");
            System.out.println("2. Cancelar Matrícula");
            System.out.println("3. Listar Todos Alunos");
            System.out.println("9. SAIR");
            opcao = Integer.parseInt(leitor.nextLine());
            switch (opcao) {
                case 1 -> ge.execMatricular();
                case 2 -> ge.execCancelarMatricula();
                case 3 -> ge.execListarTodosAlunos();
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao !=9);
    }

    public void execMatricular(){
        //objeto para ler dados do teclado (leitor)
        Scanner leitor = new Scanner(System.in);
        //recebe os dados via teclado.
        System.out.println("Digite o RA do aluno: ");
        int ra = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o email do aluno: ");
        String email = leitor.nextLine();
        System.out.println("Digite a turma do aluno: ");
        String turma = leitor.nextLine();
        //Criar o objeto aluno
        Aluno aluno = new Aluno(ra, nome, email, turma);
        //Adiciona o objeto aluno criado na lista
        alunos.add(aluno);
        aluno.matricular();
    }
    public void execCancelarMatricula(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a RA do aluno a ser cancelada a matricula");
        int raProcurado = Integer.parseInt(leitor.nextLine());
        for(Aluno  aluno : alunos){
            if(raProcurado == aluno.getRa()){
                int indice = alunos.indexOf(aluno);
                alunos.get(indice).cancelarMatricula();
                alunos.remove(indice);
                return;
            }     
        }
        System.out.println("Aluno nao encontrado");
    }
    public void execListarTodosAlunos(){
        System.out.println("===== Lista de Alunos =====");
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
        System.out.println("===========================");
    }
}
