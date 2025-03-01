public class contaPoupanca extends ContaBancaria{

    public contaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
        return 0;
        } else {
            this.saldo -= valor;
            return valor;
        }
    }
}
