import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Conta;

public class GerenciarConta {
    public List<Conta> contas = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciarConta gc = new GerenciarConta();
        int opcao = 0;
        do {
            // montar o menu
            System.out.println("=================================");
            System.out.println("| MENU DE TRANSACOES COM CONTAS |");
            System.out.println("| 1. Cadastrar nova Conta       |");
            System.out.println("| 2. Depositar valor            |");
            System.out.println("| 3. Sacar Valor                |");
            System.out.println("| 4. Emitir Saldo de Conta      |");
            System.out.println("| 5. Exibir todas as Contas     |");
            System.out.println("| 6. Exibir Saldo de Todas      |");
            System.out.println("| 9. Sair                       |");
            System.out.println("| Escolha sua opcao: ");
            opcao = Integer.parseInt(gc.sc.nextLine());
            switch (opcao) {
                case 1 -> gc.execCadastrar();
                case 2 -> gc.execDepositar();
                case 3 -> gc.execSacar();
                case 4 -> gc.execSaldo();
                case 5 -> gc.execListarTodas();
                case 6 -> System.out.println("Nao implementado");
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 9);
    }

    public void execCadastrar() {
        System.out.println("Digite o numero da conta: ");
        int numConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o nome da agencia");
        String nomeAgencia = sc.nextLine();
        // Criar uma nova conta com os dados vindo do usuario
        Conta conta = new Conta(numConta, nomeCliente, nomeAgencia);
        // Adicionar a nova conta na lista criada (contas)
        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execBuscarConta() {
        System.out.println("Digite o numero da conta a ser encontrada: ");
        int numConta = Integer.parseInt(sc.nextLine());
        // percorrer a lista de contas a procura da conta digitada
        for (Conta conta : contas) {
            if (numConta == conta.getNumConta()) {
                String texto = "N.Conta| Nome do Cliente           |Agencia       | Saldo\n";
                System.out.println(texto);
                System.out.println(conta);
                return; // volta pro menu
            }
        }
        // se conta nao encontrada
        System.out.println("Conta nao existente na lista");
    }

    public void execListarTodas() {
        String texto = "N.Conta| Nome do Cliente           |Agencia           | Saldo";
        System.out.println(texto);
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void execDepositar() {
        System.out.println("Digite o numero da conta a depositar: ");
        int numConta = Integer.parseInt(sc.nextLine());
        // percorrer a lista de contas a procura da conta digitada
        for (Conta conta : contas) {
            if (numConta == conta.getNumConta()) {
                System.out.println("Digite o valor do deposito: ");
                double valor = Double.parseDouble(sc.nextLine());
                conta.depositar(valor);
                System.out.println("Deposito efetuado com sucesso");
                return; // volta pro menu
            }
        }
        // se conta nao encontrada
        System.out.println("Conta nao existente na lista");
    }

    public void execSacar() {
        System.out.println("Digite o numero da conta a ser sacada: ");
        int numConta = Integer.parseInt(sc.nextLine());
        // percorrer a lista de contas a procura da conta digitada
        for (Conta conta : contas) {
            if (numConta == conta.getNumConta()) {
                System.out.println("Digite o valor do saque: ");
                double valor = Double.parseDouble(sc.nextLine());
                conta.sacar(valor);
                System.out.println("Saque efetuado com sucesso");
                return; // volta pro menu
            }
        }
        // se conta nao encontrada
        System.out.println("Conta nao existente na lista");
    }

    public void execSaldo() {
        System.out.println("Digite o numero da conta a ser encontrada: ");
        int numConta = Integer.parseInt(sc.nextLine());
        // percorrer a lista de contas a procura da conta digitada
        for (Conta conta : contas) {
            if (numConta == conta.getNumConta()) {
                conta.emitirSaldo();
                return; // volta pro menu
            }
        }
        // se conta nao encontrada
        System.out.println("Conta nao existente na lista");
    }

}
