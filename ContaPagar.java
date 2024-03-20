package polimorfismo_classe_abstrata;

public class ContaPagar extends Conta{
    String fornecedor;
    SituacaoConta situacao;

    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor.getNome();
    } 

    public void setFornecedor(Fornecedor nome){
        this.fornecedor = nome.getNome();
    }

    public ContaPagar(){}

    public void pagar(){
        situacao = SituacaoConta.PAGA;
        System.out.println("O valor foi pago.");
    }
}    

