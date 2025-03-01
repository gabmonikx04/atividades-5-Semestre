public abstract class ContaBancaria {

    int numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    abstract double sacar(double valor);

    void exibirInformacoes(){

        System.out.println( "Numero da Conta:"  + this.numeroConta );
        System.out.println( "Titular da Conta:" + this.titular );
        System.out.println("Saldo: " + this.saldo);
    }

}
