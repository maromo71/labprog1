import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExercicioB extends JFrame implements ActionListener{
    private JLabel labelValor1;
    private JLabel labelValor2;
    private JLabel labelResultado;
    private JTextField campoValor1;
    private JTextField campoValor2;
    private JButton btnSomar;
    private JButton btnLimpar;

    public ExercicioB(){
        setTitle("Calculadora Básica");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 12, 12));
        
        labelValor1 = new JLabel("Valor 1:");
        campoValor1 = new JTextField(10);
        
        labelValor2 = new JLabel("Valor 2:");
        campoValor2 = new JTextField(10);
        
        btnSomar = new JButton("Somar");
        btnSomar.addActionListener(this);

        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(this);
        
        labelResultado = new JLabel("Resultado: ");

        panel.add(labelValor1);
        panel.add(campoValor1);
        panel.add(labelValor2);
        panel.add(campoValor2);
        panel.add(btnSomar);
        panel.add(btnLimpar);
        panel.add(labelResultado);
        
        add(panel);

    }


    public static void main(String[] args) {
        ExercicioB tela = new ExercicioB();
        tela.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSomar){
            double valor1 = Double.parseDouble(campoValor1.getText());
            double valor2 = Double.parseDouble(campoValor2.getText());
            double soma = valor1 + valor2;
            labelResultado.setText(labelResultado.getText() + " = " + soma);
            return;
        }
        if(e.getSource()==btnLimpar){
            campoValor1.setText("'");
            campoValor2.setText("");
            labelResultado.setText("Resultado: ");
        }
    }

    

}
