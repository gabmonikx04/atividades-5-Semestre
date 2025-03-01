public class CarroEletrico extends Carro{

    static float bateriaKWH;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.consumo = 5;
    }

    @Override
    float calcularEconimia() {
        return bateriaKWH / consumo;
    }
}
