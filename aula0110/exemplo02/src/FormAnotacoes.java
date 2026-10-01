import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FormAnotacoes extends JFrame {
    private JLabel labelAnotacao;
    private JTextArea textAnotacao;
    private JButton buttonAnotacao;

    public FormAnotacoes() { // construtor
        setTitle("Minhas Anotações");
        setSize(600, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        labelAnotacao = new JLabel("Sua Anotacao");
        textAnotacao = new JTextArea(20, 50);
        buttonAnotacao = new JButton("Gravar Nota");

        add(labelAnotacao);
        add(textAnotacao);
        add(buttonAnotacao);

        buttonAnotacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarAnotacao();
            }

            private void salvarAnotacao() {
                // Obtém o texto digitado pelo usuário.
                String anotacao = textAnotacao.getText();
                if (anotacao.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, digite uma anotação",
                            "aviso",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Nome do arquivo onde as anotações serão salvas.
                String nomeArquivo = "c:\\diretorio\\anotacoes.txt";
                // Usando a abordagem clássica de I/O (java.io) para salvar.
                // O "true" no construtor de FileWriter indica que o arquivo deve ser aberto em
                // modo de anexo (append).
                // try-with-resources garante que o BufferedWriter e o FileWriter sejam fechados
                // automaticamente.
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
                    writer.write(anotacao);
                    writer.newLine(); // Adiciona uma nova linha para separar as anotações.
                    JOptionPane.showMessageDialog(null, "Anotação salva com sucesso usando Java I/O!", "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar com Java I/O: " + ioException.getMessage(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }

                /**
                 * Método comentado - agora nao utilizado
                 * 
                 * 
                 * try {
                 * // Cria um objeto Path que representa o caminho para o arquivo.
                 * Path pathArquivo = Path.of(nomeArquivo);
                 * // Usa Files.writeString() para escrever no arquivo.
                 * // StandardOpenOption.APPEND: anexa o conteúdo ao final do arquivo.
                 * // StandardOpenOption.CREATE: cria o arquivo se ele não existir.
                 * // Adicionamos a anotação e uma nova linha.
                 * Files.writeString(pathArquivo, anotacao + System.lineSeparator(),
                 * StandardOpenOption.APPEND,
                 * StandardOpenOption.CREATE);
                 * JOptionPane.showMessageDialog(null, "Anotação salva com sucesso usando Java
                 * NIO!", "Sucesso",
                 * JOptionPane.INFORMATION_MESSAGE);
                 * } catch (IOException ioException) {
                 * JOptionPane.showMessageDialog(null, "Erro ao salvar com Java NIO: " +
                 * ioException.getMessage(),
                 * "Erro",
                 * JOptionPane.ERROR_MESSAGE);
                 * }
                 */

                // Limpa o TextArea após salvar a anotação.
                textAnotacao.setText("");
            }
        });
    }
}
