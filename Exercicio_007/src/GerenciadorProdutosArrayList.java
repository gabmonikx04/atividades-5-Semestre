import java.util.ArrayList;
import java.util.Optional;

public class GerenciadorProdutosArrayList {

    private ArrayList<Produto> produtos;

    public GerenciadorProdutosArrayList() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto( Produto produto ) {
        produtos.add( produto );
    }

    public Produto buscarProdutoPorCodigo( int codigo ) {
        for ( Produto produto : produtos ) {
            if ( produto.getCodigo() == codigo ) {
                return produto;
            }
        }
        return null;
    }

}
