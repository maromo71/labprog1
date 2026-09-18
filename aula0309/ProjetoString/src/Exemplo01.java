import javax.swing.JOptionPane;

public class Exemplo01 {
    public static void main(String[] args) {
        String nome = "Marcos Moraes";
        JOptionPane.showMessageDialog(
            null,
            "Quantidade de letras: " + nome.length(),
            "Ola",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
