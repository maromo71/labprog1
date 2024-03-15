package view;


import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Nossa tela de movimento
public class CaixaGUI extends JFrame implements ActionListener {
    //Atributos
    private Label lblValor;
    private Label lblSaldo;
    private TextField txtValor;
    private TextField txtSaldo;
    private Button cmdEntrada, cmdSaida, cmdConsulta, cmdRetirada;
    private TextArea txtMsg;
    private Dimension dFrame, dLabel, dTextField, dButton, dTextArea;

    private Caixa caixa;
    //Método contrutor
    public CaixaGUI(){
        //Instanciar o caixa
        caixa = new Caixa();
        //Aparencia da janela
        dFrame = new Dimension(350, 400);
        setSize(dFrame);
        setResizable(false);
        setTitle("Controle de Caixa");
        setLayout(null); //definiremos as posicoes
        setLocationRelativeTo(null); //centro da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para x fechar o programa
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //Componentes da janela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);//adicionando na janela

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        add(cmdEntrada);
        cmdEntrada.addActionListener(this);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        add(cmdRetirada);
        cmdRetirada.addActionListener(this);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        add(cmdConsulta);
        cmdConsulta.addActionListener(this);

        cmdSaida = new Button("Sair");
        cmdSaida.setSize(dButton);
        cmdSaida.setLocation(180,185);
        add(cmdSaida);
        cmdSaida.addActionListener(this);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSaida){
            System.exit(0);
        }
        if(e.getSource()==cmdConsulta){
            //consultar o saldo
            double saldo = caixa.getSaldo();
            txtSaldo.setText(Double.toString(saldo));
            txtValor.setText(null);
            txtMsg.append("Consulta ao saldo efetuada\n");
            return;
        }
        if(e.getSource()==cmdEntrada){
            //deposito
            double valor = Double.parseDouble(txtValor.getText());
            caixa.depositar(valor);
            txtMsg.append("Depósito efetuado com sucesso\n");
            txtValor.setText(null);
            txtSaldo.setText(null);
            txtValor.requestFocus(); //colocar o foco no valor
            return;
        }
        if(e.getSource()==cmdRetirada){
            //retirada
            double valor = Double.parseDouble(txtValor.getText());
            caixa.sacar(valor);
            txtMsg.append("Saque efetuado com sucesso\n");
            txtValor.setText(null);
            txtSaldo.setText(null);
            txtValor.requestFocus(); //colocar o foco no valor
        }
    }
}
