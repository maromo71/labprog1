import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo ou diretorio: ");
        Path path = Paths.get(sc.nextLine());
        if(Files.exists(path)){
            System.out.println("Caminho encontrado");
            System.out.printf("%n%s existe%n", path.getFileName());
            System.out.printf("%s diretorio.%n", Files.isDirectory(path) ? "É " : "Nao é " );
            if(Files.isDirectory(path)){
                System.out.println(">>>> Conteudo <<<<<");
                DirectoryStream<Path> ds = Files.newDirectoryStream(path);
                for(Path item : ds){
                    System.out.println(item);
                }
                System.out.println(">>>> Fim do diretorio <<<< ");
            }
        }else{
            System.out.println("Caminho nao encontrado");
        }
    }
}
