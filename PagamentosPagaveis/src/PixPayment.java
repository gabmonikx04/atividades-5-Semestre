import java.util.Random;
import java.util.UUID;

public class PixPayment implements PaymentStrategy{
    public void ProcessPayment( double amount ) {
        Random pix = new Random();
        Double Pix = pix.nextDouble( 24 ) ;

        UUID id = new UUID(48,48 );

        System.out.println("Sua Chave Pix: " + id.toString() );
    }
}
