public class onibus extends Veiculo{

    int quantidadeExos;
    float tanque = 200;
    float consumo = 5;

    public onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeExos) throws IllegalAccessException {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);

        if ( quantidadeExos < 6 || quantidadeExos > 8 )
            throw new IllegalAccessException( "Quantidade de eixos tem que ser entre 6 a 8" ) ;
        this.quantidadeExos = quantidadeExos;
    }

    @Override
    float calcularEconimia() {
        return tanque / consumo;
    }
}
