import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    public void ProcessPayment( double amount ) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira O Numero Do Cartao");
        int numeroCartao = teclado.nextInt();
        System.out.println("Pagamento Bem Sucedido");
    }
}
