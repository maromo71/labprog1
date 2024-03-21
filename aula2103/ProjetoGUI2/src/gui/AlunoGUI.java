package gui;

import model.Aluno;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class AlunoGUI {
    private JPanel alunoPanel;
    private JTextField txtRa;
    private JTextField txtNome;
    private JTextField txtTurma;
    private JTextField txtEmail;
    private JButton adicionarButton;
    private JButton localizarButton;
    private JButton excluirButton;
    private JButton sairButton;

    private Aluno aluno;

    private List<Aluno> listaAlunos;

    public JPanel getAlunoPanel() {
        return alunoPanel;
    }

    public AlunoGUI(){
        listaAlunos = new ArrayList<>();

        adicionarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //lógica do adicionar aluno
                int ra = Integer.parseInt(txtRa.getText());
                String nome = txtNome.getText();
                String turma = txtTurma.getText();
                String email = txtEmail.getText();
                Aluno alu = new Aluno(ra, nome, turma, email);
                listaAlunos.add(alu); //adicionado na lista
                txtRa.setText(null);
                txtNome.setText(null);
                txtTurma.setText(null);
                txtEmail.setText(null);
                txtRa.requestFocus(); //colocar o foco no ra
                JOptionPane.showMessageDialog(
                        null,
                        "Aluno cadastrado com sucesso",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        localizarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(txtRa.getText().isEmpty()) {
                    return;
                }
                int raProc = Integer.parseInt(txtRa.getText());
                //varrer a lista a procura do ra digitado
                for(Aluno aluno : listaAlunos){
                    if(aluno.getRa()==raProc){
                        txtNome.setText(aluno.getNome());
                        txtTurma.setText(aluno.getTurma());
                        txtEmail.setText(aluno.getEmail());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Aluno não encontrado",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
        excluirButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(txtRa.getText().isEmpty()) {
                    return;
                }
                int raProc = Integer.parseInt(txtRa.getText());
                //varrer a lista a procura do ra digitado
                for(Aluno aluno : listaAlunos){
                    if(aluno.getRa()==raProc){
                        listaAlunos.remove(aluno);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Aluno excluído com sucesso",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
