import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> equipeBack = new HashSet<>();
        equipeBack.add("Alice");
        equipeBack.add("Bruno");
        equipeBack.add("Carlos");

        Set<String> equipeFront = new HashSet<>();
        equipeFront.add("Bruno");
        equipeFront.add("Daniel");
        equipeFront.add("Eva");
        //Temos todos da equipe front na equipe back ???
        System.out.println(equipeBack.containsAll(equipeFront));
        Set<String> equipeComum = new HashSet<>();
        equipeComum.addAll(equipeBack);
        equipeComum.retainAll(equipeFront);

        for(String pessoa : equipeComum){
            System.out.println(pessoa);
        }

    }
}
