import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<>();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.setCodigo(1);
        cliente1.setNome("Chicao");
        cliente1.setSalario(2000);

        cliente2.setCodigo(2);
        cliente2.setNome("Maria");
        cliente2.setSalario(5000);

        lista.add(cliente1);
        lista.add(cliente2);
        for(Cliente cliente : lista){
            System.out.println(cliente);
        }
    }
}