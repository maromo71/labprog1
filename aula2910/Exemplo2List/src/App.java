import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List lista = new ArrayList();
        lista.add(150);
        lista.add("Texto");
        lista.add(23.4);
        lista.add("Texto");
        lista.add(new Object());
        //total de elementos na lista - uso o size
        System.out.println("Tamanho: " + lista.size());
        //mostrar os elementos
        for(Object item : lista) System.out.println(item);
        while(lista.contains("Texto")) lista.remove("Texto");
        //total de elementos na lista - uso o size
        System.out.println("Tamanho: " + lista.size());
        for(Object item : lista) System.out.println(item);
        lista.remove((Integer)150);
         System.out.println("Tamanho: " + lista.size());
        for(Object item : lista) System.out.println(item);

        List<String> frutas = new ArrayList<>();
        frutas.add("Morango");
        frutas.add("Manga");
        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }
}
