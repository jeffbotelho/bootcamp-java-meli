package poo.javaii;

public class Pessoa {

    private String nome;
    private int idade;
    private String id;
    private float peso;
    private float altura;
    private double imc = 0;
    private int flag = -2;
    private boolean ehMaior = false;


    public Pessoa(){
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade + " anos" +
                ", ID: " + id +
                ", Peso: " + peso + "KG" +
                ", Altura: " + altura + "m";
    }

    public double calcularImc() {
        imc = this.peso / Math.pow(this.altura, 2);

        if (imc < 20) {
            flag = -1;
        } else if (imc >= 20 && imc <= 25) {
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }

    public boolean ehMaiorIdade() {
        if (this.idade >= 18) {
            ehMaior = true;
        }
        return ehMaior;

    }

}


