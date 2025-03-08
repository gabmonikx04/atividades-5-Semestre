public class PaymentProcessor implements PaymentStrategy {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(int Opcao) {
        PaymentFactory factorio = new PaymentFactory();
        switch (Opcao){
            case 1:
                paymentStrategy = factorio.getPaymentMethod("Pix");
                break;
            case 2:
                paymentStrategy = factorio.getPaymentMethod("Credito");
                break;
            case 3:
                paymentStrategy = factorio.getPaymentMethod("Boleto");
                break;
        }

    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void ProcessPayment(double amount) {
        paymentStrategy.ProcessPayment(amount);
    }
}