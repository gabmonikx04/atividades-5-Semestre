import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList< OpcoesDoBalacoBaco > opcoes = new ArrayList< OpcoesDoBalacoBaco >( 3 );
        Scanner teclado = new Scanner(System.in);

        opcoes.add( new OpcoesDoBalacoBaco( 1, "Pix", new PixPayment() ) );
        opcoes.add( new OpcoesDoBalacoBaco( 2, "Cartao De Credito", new CreditCardPayment() ) );
        opcoes.add( new OpcoesDoBalacoBaco( 3, "Boleto", new BoletoPayment() ) );

        do {
            System.out.println("Insira o que desejas fazer");
            System.out.println("0 - Sair");
            for ( OpcoesDoBalacoBaco opcao : opcoes ) {
                opcao.exibirOpcao();
            }
            int OpcaoSelecionada = teclado.nextInt();

            if ( OpcaoSelecionada > opcoes.size() ){
                System.out.println("Opcao Invalida");
                continue;
            }
            if ( OpcaoSelecionada == 0 ) {
                break;
            }

            System.out.println("Insira o valor da transacao");
            double valor = teclado.nextDouble();

            PaymentProcessor Pagamento = new PaymentProcessor( opcoes.get( OpcaoSelecionada - 1 ).getPagamento() );
            Pagamento.ProcessPayment( valor );

        } while ( true );

        System.out.println("acabo!");
    }
}
