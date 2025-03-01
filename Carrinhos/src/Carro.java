public class Carro extends Veiculo {

    String tipoCarro;
    float tanque = 50;
    float consumo = 12;
    float economia;

    public Carro(String marca,
                 String modelo,
                 int ano,
                 int capacidadePassageiros,
                 String combustivel,
                 String tipoCarro ){
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    float calcularEconimia() {
        return tanque / consumo;
    }
}
