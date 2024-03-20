package polimorfismo_classe_abstrata;

public class ContaReceber extends Conta{
    String cliente;
    SituacaoConta situacao;


    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.cliente = cliente.getNome();
    } 

    public void setCliente(Cliente nome){
        this.cliente = nome.getNome();
    }

    public ContaReceber(){}

    public void receber(){
        situacao = SituacaoConta.PAGA;
        System.out.println("Pagamento recebido.");
    }

    public void cancelar(){
        if(this.valor > 50000){
            situacao = SituacaoConta.PENDENTE;
            System.out.println("Não foi possivel efetuar o cancelamento...");
        }else{
            situacao = SituacaoConta.CANCELADA;
            System.out.println("Cancelamento efetuado com sucesso.");
        }
    }


}
