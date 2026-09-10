package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Caixa;

import java.awt.*;
public class CaixaView extends JFrame {
    //atributos referentes ao tamanho dos elementos
    private Dimension dFrame, dButton, dTextField, dTextArea, dLabel;
    //atributos referentes aos elementos que estao na janela
    private JLabel lblValor, lblSaldo;
    private JTextField txtValor, txtSaldo;
    private JButton btnDepositar, btnSacar, btnSaldo, btnSair;
    private JTextArea txtMsg;
    //atributo com nossas regras de negocio
    private Caixa caixa;

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
        add(btnDepositar);

        btnSacar = new JButton("Sacar");
        btnSacar.setSize(dButton);
        btnSacar.setLocation(180, 150);
        add(btnSacar);

        btnSaldo = new JButton("Consultar");
        btnSaldo.setSize(dButton);
        btnSaldo.setLocation(25, 185);
        add(btnSaldo);

        btnSair = new JButton("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(180,185);
        add(btnSair);

        txtMsg = new JTextArea("");
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 215);
        add(txtMsg);
    }

}
