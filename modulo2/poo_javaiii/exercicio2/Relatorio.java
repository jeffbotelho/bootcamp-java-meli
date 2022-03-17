package poo.javaiii.exercicio2;

public class Relatorio implements Impressora {

    private float cumprimentoDoTexto;
    private int numeroPaginas;
    private String autor;
    private String revisor;

    public Relatorio(float cumprimentoDoTexto, int numeroPaginas, String autor, String revisor) {
        this.cumprimentoDoTexto = cumprimentoDoTexto;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir relatorio");
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "cumprimentoDoTexto=" + cumprimentoDoTexto +
                ", numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    public float getCumprimentoDoTexto() {
        return cumprimentoDoTexto;
    }

    public void setCumprimentoDoTexto(float cumprimentoDoTexto) {
        this.cumprimentoDoTexto = cumprimentoDoTexto;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
}


