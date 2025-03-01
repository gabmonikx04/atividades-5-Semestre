
abstract public class Veiculo {

    String marca;
    String modelo;
    int ano;
    int capacidadePassageiros;
    String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    abstract float calcularEconimia();

    void exibirInformacoes(){

        System.out.println( "Marca:"  + this.marca );
        System.out.println("Modelo" + this.modelo );
        System.out.printf( "Ano: %d \n",this.ano );
        System.out.printf( "Capacidade Passageiros: %d\n",this.capacidadePassageiros );
        System.out.println( "Combustivel:  " + this.combustivel );
        System.out.println( "Economia: " + calcularEconimia() );

    };

}
