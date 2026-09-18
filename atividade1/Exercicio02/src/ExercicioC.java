import java.util.Scanner;

public class ExercicioC {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a linha de LOG corretamente: ");
        String log = scanner.nextLine();
        
        if (!log.startsWith("[LOG-")) {
            System.out.println("Formato inválido");
            scanner.close();
            return;
        }
        
        int primeiroHashTag = log.indexOf('#');
        int segundoHashTag = log.indexOf('#', primeiroHashTag + 1);
        String codigoTicket = log.substring(primeiroHashTag + 1, segundoHashTag);
        
        boolean comFalha = log.contains("Falha");
        boolean severidade = log.regionMatches(true, 0, "[log-cr", 0, 7);
        
        String textoNormalizado = log.replace(",", " ").replace(" - ", " ");
        
        int ultimoEspaco = textoNormalizado.lastIndexOf(' ');
        String sobrenome = textoNormalizado.substring(ultimoEspaco + 1);
        
        boolean terminaComSilva = textoNormalizado.endsWith("Silva");
        
        System.out.println("Código do Ticket.......: " + codigoTicket);
        System.out.println("Contém Falha...........: " + comFalha);
        System.out.println("Severidade Crítica.....: " + severidade);
        System.out.println("Texto Normalizado......: " + textoNormalizado);
        System.out.println("Sobrenome..............: " + sobrenome);
        System.out.println("Termina com Silva......: " + terminaComSilva);
        scanner.close();
    }
}
