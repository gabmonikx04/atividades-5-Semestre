public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Carro gasosa = new Carro( "Fiat","Santa fé", 2024, 6, "gasolina","SUV" );
        Carro eletrico = new CarroEletrico( "Fiat","Santa fé", 2024, 6, "gasolina","SUV" );
        Caminhao vruum = new Caminhao( "Guerra", "truncado", 2024, 3,"disel", 12 );
        Caminhao friumm = new caminhaoRefrigerado( "Guerra", "truncado", 2024, 3,"disel", 12, 4.5F);
        onibus onbius = new onibus( "TCC","Publico",2013,80,"Disel",7 );

        gasosa.exibirInformacoes();
        System.out.println();
        eletrico.exibirInformacoes();
        System.out.println();
        vruum.exibirInformacoes();
        System.out.println();
        friumm.exibirInformacoes();
        System.out.println();
        onbius.exibirInformacoes();

        System.out.println("Hello, World!");
    }
}