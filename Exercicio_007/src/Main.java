import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        GerenciadorProdutosArrayList gerenciador = new GerenciadorProdutosArrayList();

        do {
            System.out.println("\n------------ Menu ------------");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.println("-------------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionada.");

                    Produto produto = PegaProduto();

                    gerenciador.cadastrarProduto( produto );
                    break;

                case 2:
                    System.out.println("Opção de busca selecionada.");
                    int codigo = PegaCodigoProduto();
                    Produto busca = gerenciador.buscarProdutoPorCodigo( codigo );
                    if ( busca != null ) {
                        System.out.println("Produto encontrado com sucesso.");
                        busca.exibirInformacoes();
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static Produto PegaProduto() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        return new Produto( codigo, nome, preco );

    }

    public static int PegaCodigoProduto(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        return codigo;

    }

}
