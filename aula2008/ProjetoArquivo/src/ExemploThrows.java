import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExemploThrows {
    public static void main(String[] args) {
        String nomeArquivoExistente = "/pasta/teste.txt"; //Caminho real
        System.out.println("Tentando ler o arquivo");
        try{
            lerArquivo(nomeArquivoExistente);
        }catch(IOException ex){
            System.out.println("Erro ao tentar ler o Arquivo");
            System.out.println("Verifique o caminho");
        }   
    }

    public static void lerArquivo(String caminhoArquivo) throws IOException{
        FileReader reader = null;
        try{
            File arquivo = new File(caminhoArquivo);
            reader = new FileReader(arquivo);
            int caractere;
            while((caractere = reader.read()) != -1){
                System.out.print((char) caractere);
            }
        }finally{
            if(reader != null){
                reader.close();
                System.out.println("Arquivo fechado com sucesso");
            }
        }
    }
}
