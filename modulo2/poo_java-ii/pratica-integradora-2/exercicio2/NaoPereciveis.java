package poo.javaii.pratica2.exercicio2;

public class NaoPereciveis extends Produto{
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public void calcular(int qtdProdutos) {
        super.calcular(qtdProdutos);
    }

    public NaoPereciveis(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto: " + super.getNome()  +
                ", Preço: " + super.getPreco() +
                ", preço por qtd de produtos: " + super.getPrecoCalculado() +
                 ", Nao Perecível, " +
                "tipo: " + tipo;
    }
}


