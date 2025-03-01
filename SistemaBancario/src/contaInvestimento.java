public class contaInvestimento extends ContaBancaria{
    double taxaRendimento;

    public contaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = 0.02;
    }

    @Override
    double sacar(double valor) {
        double saldoCalculado = calculaSaque(valor);
        if ( saldoCalculado > this.saldo){
            System.out.println("Saldo insuficiente");
            return 0;
        } else {
            this.saldo -= saldoCalculado;
            return valor;
        }
    }

    double calculaSaque(double valor){
        return valor + (valor * this.taxaRendimento);
    }
}
