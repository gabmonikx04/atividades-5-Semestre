public class BoletoPayment implements PaymentStrategy{
    public void ProcessPayment( double amount ) {
        Double Codigo = Math.random() * 1000;
        System.out.println("Boleto gerado no valor de: " + amount );
        System.out.println("Codigo Do Boleto: " + Codigo.toString() );
    }
}
