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
                case 6 -> gc.execSaldoTodasAsContas();
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 9);
    }

    private void execSaldoTodasAsContas() {
        double total = 0;
        for(Conta conta: contas){
            total += conta.getSaldo();
        }
        System.out.println("Total geral das contas R$ " + total);
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

    // Este metodo deve ser refatorada para devolver uma conta buscada
    // ou nulo quando nao tivermos conta.
    public Conta execBuscarConta() {
        System.out.println("Digite o numero da conta a ser encontrada: ");
        int numConta = Integer.parseInt(sc.nextLine());
        // percorrer a lista de contas a procura da conta digitada
        for (Conta conta : contas) {
            if (numConta == conta.getNumConta()) {
                return conta;
            }
        }
        // se conta nao encontrada
        return null;
    }

    public void execListarTodas() {
        String texto = "N.Conta| Nome do Cliente           |Agencia           | Saldo";
        System.out.println(texto);
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void execDepositar() {
        try {
            Conta conta = execBuscarConta();
            if (conta != null) {
                System.out.println("Digite o valor do deposito: ");
                double valor = Double.parseDouble(sc.nextLine());
                conta.depositar(valor);
                System.out.println("Deposito efetuado com sucesso");
            } else {
                System.out.println("Conta inexistente");
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public void execSacar() {
        try {
            Conta conta = execBuscarConta();
            if (conta != null) {
                System.out.println("Digite o valor do saque: ");
                double valor = Double.parseDouble(sc.nextLine());
                conta.sacar(valor);
                System.out.println("Saque efetuado com sucesso");
            } else {
                System.out.println("Conta inexistente");
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public void execSaldo() {
        Conta conta = execBuscarConta();
        if (conta != null) {
            conta.emitirSaldo();
        } else {
            // se conta nao encontrada
            System.out.println("Conta nao existente na lista");
        }
    }
}
