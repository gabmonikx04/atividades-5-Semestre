public class contaInvestimentoAltoRisco extends contaInvestimento{

    double saqueMinimo = 10000;

    public contaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = 5.00;
    }

    @Override
    double sacar(double valor) {
        if (valor < this.saqueMinimo){
            System.out.println("Valor de saque mínimo não atingido");
            return 0;
        } else {
            return this.sacar(valor);
        }
    }

}
