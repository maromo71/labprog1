package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Caixa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CaixaView extends JFrame implements ActionListener {
    //atributos referentes ao tamanho dos elementos
    private Dimension dFrame, dButton, dTextField, dTextArea, dLabel;
    //atributos referentes aos elementos que estao na janela
    private JLabel lblValor, lblSaldo;
    private JTextField txtValor, txtSaldo;
    private JButton btnDepositar, btnSacar, btnSaldo, btnSair;
    private JTextArea txtMsg;
    //atributo com nossas regras de negocio
    private Caixa caixa = new Caixa();

    public CaixaView(){
        //definir os elementos na janela, posicionamento e tamanhos
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(140,20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(290, 140);

        //definindo a aparencia apenas da janela
        this.setTitle("Controle de Caixa");
        this.setSize(dFrame);
        this.setLayout(null);//nao usar gerenciador layout
        this.setLocationRelativeTo(null);//centraliza a janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x fecha o programa
    
        //definir os elementos que vao na janela
        lblValor = new JLabel("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor); //adiciona na janela

        lblSaldo = new JLabel("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new JTextField("");
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new JTextField("");
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        btnDepositar = new JButton("Depositar");
        btnDepositar.setSize(dButton);
        btnDepositar.setLocation(25, 150);
        btnDepositar.addActionListener(this);
        add(btnDepositar);

        btnSacar = new JButton("Sacar");
        btnSacar.setSize(dButton);
        btnSacar.setLocation(180, 150);
        btnSacar.addActionListener(this);
        add(btnSacar);

        btnSaldo = new JButton("Consultar");
        btnSaldo.setSize(dButton);
        btnSaldo.setLocation(25, 185);
        btnSaldo.addActionListener(this);
        add(btnSaldo);

        btnSair = new JButton("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(180,185);
        btnSair.addActionListener(this);
        add(btnSair);

        txtMsg = new JTextArea("");
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 215);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSair){
            JOptionPane.showMessageDialog(null, "Fim");
            System.exit(0);
        }
        if(e.getSource()==btnDepositar){
            double valor = Double.parseDouble(txtValor.getText());
            caixa.depositar(valor);
            txtMsg.append("Deposito efetuado com sucesso\n");
            txtValor.setText("");
            txtValor.requestFocus();//requer o foco
            return;
        }
        if(e.getSource()==btnSacar){
            double valor = Double.parseDouble(txtValor.getText());
            caixa.sacar(valor);
            txtMsg.append("Saque efetuado com sucesso\n");
            txtValor.setText("");
            txtValor.requestFocus();
            return;
        }
        if(e.getSource()==btnSaldo){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
        }
    }

}
