package poo.javaii.pratica2.exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private double precoCalculado;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void calcular(int qtdProdutos) {
        precoCalculado = preco * qtdProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoCalculado() {
        return precoCalculado;
    }

    @Override
    public String toString() {
        return "Produto: " + nome  +
                ", Preço: " + preco +
                ", preço por qtd de produtos: " + precoCalculado;
    }
}


