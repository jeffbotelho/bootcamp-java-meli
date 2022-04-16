package poo.javaiii.exercicio2;

public class Curriculo implements Impressora {

    private String nome;
    private byte idade;
    private String endereco;
    private String telefone;
    private String formacao;
    private String experiencia;

    public Curriculo(String nome, byte idade, String endereco, String telefone, String formacao, String experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.formacao = formacao;
        this.experiencia = experiencia;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir curriculo");
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", formacao='" + formacao + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}


