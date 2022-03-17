package poo.javaiii.exercicio2;

public class LivrosPdf implements Impressora {

    private int numeroPaginas;
    private String nomeAutor;
    private String titulo;
    private String genero;

    public LivrosPdf(int numeroPaginas, String nomeAutor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir livro");
    }

    @Override
    public String toString() {
        return "LivrosPdf{" +
                "numeroPaginas=" + numeroPaginas +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


