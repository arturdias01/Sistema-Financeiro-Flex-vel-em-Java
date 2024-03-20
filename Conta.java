package polimorfismo_classe_abstrata;

public class Conta {
    String descricao;
    double valor;
    String dataVencimento;

    public Conta(){}

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setDataVencimento(String dataVencimento){
        this.dataVencimento = dataVencimento;
    }

    public void cancelar(){
        System.out.println("Cancelamento efetuado com sucesso.");
    }
    
}
