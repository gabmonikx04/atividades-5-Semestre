public class contaSalario extends contaCorrente{

    int saqueDoMes = 0;
    double taxaSaque = 5;

    public contaSalario(int numeroConta, String titular, double saldo, double limite) {
        super(numeroConta, titular, saldo, limite);
    }

    @Override
    public double sacar(double valor) {
        if (this.saqueDoMes < 1){
            this.saqueDoMes++;
            return super.sacar(valor);
        } else {
            if (valor + this.taxaSaque > this.saldo + this.limite){
                System.out.println("Saldo insuficiente");
                return 0;
            } else {
                this.saldo -= valor + this.taxaSaque;
                return valor;
            }
        }
    }

}
