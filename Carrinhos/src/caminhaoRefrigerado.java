public class caminhaoRefrigerado extends Caminhao{

    float temperaturaMinima;
    public caminhaoRefrigerado(String marca,
                               String modelo,
                               int ano,
                               int capacidadePassageiros,
                               String combustivel,
                               int capacidadeCarga,
                               float temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    float calcularEconimia() {
        return this.tanque / ( super.calcularConsumo() * (float) ( 100 / 10 ) );
    }
}
