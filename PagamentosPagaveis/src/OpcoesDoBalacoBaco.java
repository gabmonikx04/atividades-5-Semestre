public class OpcoesDoBalacoBaco {

    private int opcao;
    private String descricao;
    private PaymentStrategy pagamento;

    public OpcoesDoBalacoBaco(int opcao, String descricao, PaymentStrategy pagamento) {
        this.opcao = opcao;
        this.descricao = descricao;
        this.pagamento = pagamento;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PaymentStrategy getPagamento() {
        return pagamento;
    }

    public void setPagamento(PaymentStrategy pagamento) {
        this.pagamento = pagamento;
    }

    public void exibirOpcao(){
        System.out.println( this.opcao + " - " + this.descricao );
    }

}
