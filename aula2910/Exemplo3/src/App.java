import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("Leite");
        minhaLista.add("Pao");
        minhaLista.add("Cafe");
        minhaLista.add("Leite");
        System.out.println("Itens no momento: " + minhaLista.size());
        List<String> itensNovos = new ArrayList<>();
        itensNovos.add("Ovos");
        itensNovos.add("Frutas");
        minhaLista.addAll(itensNovos);
        if(minhaLista.contains("Cafe")){
            System.out.println("Tem cafe");
        }else{
            System.out.println("Nao tem cafe");
        }
        minhaLista.remove("Pao");
        System.out.println("Itens no momento: " + minhaLista.size());
        Object[] array = minhaLista.toArray();
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
