import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> bolas = new HashSet<>();
        bolas.add(1);
        bolas.add(2);
        bolas.add(3);
        bolas.add(3);
        bolas.add(4);

        bolas.remove(1);
        System.out.println("Quantidade de bolas: " + bolas.size());
        System.out.println(bolas);

        List<Integer> lista = Arrays.asList(3, 5, 7, 3, 1, 2, 7);
        System.out.println(lista);
        Set<Integer> numerosUnicos = new HashSet<>(lista);
        System.out.println(numerosUnicos);

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Maromo", 51);
        pessoas.put("Pedro", 27);
        System.out.println(pessoas);
        //Iterando sobre o Map, percorrendo e mostrando o nome e a chave do campo
        //desejado
        for (String nome : pessoas.keySet()) {
            System.out.println(nome + " -> " + pessoas.get(nome));
        }

    }
}
