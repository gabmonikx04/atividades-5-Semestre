public class Produto {

    private int Codigo;
    private String Nome;
    private double Preco;

    public Produto(int codigo, String nome, double preco) {
        Codigo = codigo;
        Nome = nome;
        Preco = preco;
    }

    public Produto() {
        Codigo = 0;
        Nome = "";
        Preco = 0;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + Codigo);
        System.out.println("Nome: " + Nome);
        System.out.println("Preço: " + Preco);
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getCodigo() {
        return Codigo;
    }
}
