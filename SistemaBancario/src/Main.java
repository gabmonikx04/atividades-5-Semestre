import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        // Escolher o tipo de conta
        while (conta == null) {
            System.out.println("Escolha o tipo de conta:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Conta Investimento");
            System.out.println("4 - Conta Salário");
            System.out.println("5 - Conta Investimento Alto Risco");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            // Solicitar dados básicos
            System.out.print("Número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Titular: ");
            String titular = scanner.nextLine();

            System.out.print("Saldo inicial: ");
            double saldo = scanner.nextDouble();

            // Criar a conta conforme a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.print("Limite do cheque especial: ");
                    double limiteCheque = scanner.nextDouble();
                    conta = new contaCorrente(numeroConta, titular, saldo, limiteCheque);
                    break;
                case 2:
                    conta = new contaPoupanca(numeroConta, titular, saldo);
                    break;
                case 3:
                    conta = new contaInvestimento(numeroConta, titular, saldo);
                    break;
                case 4:
                    System.out.print("Limite do cheque especial: ");
                    double limiteSalario = scanner.nextDouble();
                    conta = new contaSalario(numeroConta, titular, saldo, limiteSalario);
                    break;
                case 5:
                    conta = new contaInvestimentoAltoRisco(numeroConta, titular, saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        // Menu de operações
        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Exibir informações da conta");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    double saqueEfetuado = conta.sacar(valorSaque);
                    if (saqueEfetuado > 0) {
                        System.out.println("Saque realizado com sucesso. Valor debitado: R$" + saqueEfetuado);
                    } else {
                        System.out.println("Saque não realizado. Verifique o saldo e as regras da conta.");
                    }
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 3:
                    conta.exibirInformacoes();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
