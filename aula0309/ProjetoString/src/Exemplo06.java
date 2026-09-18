import java.util.ArrayList;
import java.util.List;


public class Exemplo06 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria Souza");
        nomes.add("Pedro Barbosa");
        nomes.add("Paulo Souza");
        nomes.add("Ricardo Souza");
        //Criar uma lista da familia souza
        List<String> souzas = new ArrayList<>();
        for(String nome : nomes){
            if(nome.endsWith("Souza")){
                souzas.add(nome);
            }
        }
        //Imprimindo a lista de Souzas
        for(String membro : souzas){
            System.out.println(membro);
        } 
    }
}
