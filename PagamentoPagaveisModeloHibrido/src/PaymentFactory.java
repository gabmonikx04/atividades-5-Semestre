public class PaymentFactory {

    public PaymentStrategy getPaymentMethod(String paymentMethod) {
        if (paymentMethod == null) {
            return null;
        }

        return switch (paymentMethod) {
            case "Pix" -> new PixPayment();
            case "Credito" -> new CreditCardPayment();
            case "Boleto" -> new BoletoPayment();
            default -> null;
        };

    }

}
