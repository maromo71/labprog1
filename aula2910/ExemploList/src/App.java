import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Conta> lista = new LinkedList<>();
        long inicio, fim;
        inicio = System.currentTimeMillis();
        for(int i=1; i<=2600000; i++){
            lista.add(new Conta(i, "Nome do Meu Cliente " + i));
        }
        fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo para inserir em segundos: " + tempo);
        inicio = System.currentTimeMillis();
        for(Conta x : lista){
           Conta conta = x;
        }
        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo para leitura em segundos: " + tempo);
    }
}
