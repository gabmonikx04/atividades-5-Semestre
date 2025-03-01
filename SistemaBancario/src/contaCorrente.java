public class contaCorrente extends ContaBancaria{
    double limite;

    public contaCorrente(int numeroConta, String titular, double saldo, double limite) {
        super( numeroConta, titular, saldo);
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        if (valor > this.saldo + this.limite){
            System.out.println("Saldo insuficiente");
            return 0;
        } else {
            this.saldo -= valor;
            return valor;
        }
    }
}
