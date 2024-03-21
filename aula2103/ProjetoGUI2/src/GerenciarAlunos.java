import gui.AlunoGUI;

import javax.swing.*;

public class GerenciarAlunos {
    public static void main(String[] args) {
        JFrame telaAluno = new JFrame();
        telaAluno.setContentPane(new AlunoGUI().getAlunoPanel());
        telaAluno.setVisible(true);
        telaAluno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        telaAluno.setSize(400, 500);
        telaAluno.setResizable(false);
        telaAluno.setLocationRelativeTo(null);
    }
}
