package view;


import model.Caixa;

import javax.swing.*;
import java.awt.*;

//Nossa tela de movimento
public class CaixaGUI extends JFrame {
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

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        add(cmdRetirada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        add(cmdConsulta);

        cmdSaida = new Button("Sair");
        cmdSaida.setSize(dButton);
        cmdSaida.setLocation(180,185);
        add(cmdSaida);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    }
}
