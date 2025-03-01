public class Caminhao extends Veiculo {

    int capacidadeCarga;
    float tanque = 300;
    float consumo = 6;

    public Caminhao(String marca,
                    String modelo,
                    int ano,
                    int capacidadePassageiros,
                    String combustivel,
                    int capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    float calcularEconimia() {
        return tanque / calcularConsumo() ;
    }

    float calcularConsumo(){
        if ( this.capacidadeCarga > 25 )
            return  consumo * (float) ( 25 / 100 );
        else
            return consumo * (float) this.capacidadeCarga / 100;
    }

}
