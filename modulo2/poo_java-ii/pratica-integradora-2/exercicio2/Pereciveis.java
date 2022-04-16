package poo.javaii.pratica2.exercicio2;

public class Pereciveis extends Produto {
    private int diasParaVencer;
    private double valorComDesconto;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public void calcular(int qtdProdutos) {
        super.calcular(qtdProdutos);

        if (diasParaVencer == 1) {
            valorComDesconto = getPrecoCalculado() / 4;
        } else if (diasParaVencer == 2) {
            valorComDesconto = getPrecoCalculado() / 3;
        } else if (diasParaVencer == 3) {
            valorComDesconto = getPrecoCalculado() / 2;
        }

    }

    public Pereciveis(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Produto: " + super.getNome()  +
                ", Preço: " + super.getPreco() +
                ", preço por qtd de produtos: " + super.getPrecoCalculado() +
                " Produto perecível, " +
                "dias para vencer: " + diasParaVencer +
                ", valor com desconto: " + valorComDesconto;
    }

}


