import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int OpcaoSelecionada;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Insira o que desejas fazer");
            System.out.println("0 - Sair");
            System.out.println("1 - Pagar Pix");
            System.out.println("2 - Pagar Cartao De Credito");
            System.out.println("3 - Pagar Boleto");
            OpcaoSelecionada = teclado.nextInt();

            if ( OpcaoSelecionada > 3 || OpcaoSelecionada < 0 ){
                System.out.println("Opcao Invalida");
                continue;
            }

            if ( OpcaoSelecionada == 0 ) {
                break;
            }

            System.out.println("Insira o valor da transacao");
            double valor = teclado.nextDouble();

            PaymentProcessor Pagamento = new PaymentProcessor( OpcaoSelecionada );
            Pagamento.ProcessPayment( valor );

        } while ( true );

        System.out.println("acabo!");
    }
}
