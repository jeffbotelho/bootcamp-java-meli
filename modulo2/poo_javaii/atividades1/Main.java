package poo.javaii;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa personagem = new Pessoa("Roronoa Zoro", 21, "s4nt0ryu");
        Pessoa marcelinho = new Pessoa("Marcelinho", 12, "hum0r15t4", 0.6F, 0.5F);

        System.out.println(pessoa.toString());
        System.out.println(personagem.toString());

        //Pessoa pessoaTeste = new Pessoa("Sem nome", 00);

        //System.out.println(pessoaTeste.toString());

        /* O objeto pessoaTeste acusa o seguinte erro:
         java: no suitable constructor found for Pessoa(java.lang.String,int)
    constructor poo.javaii.Pessoa.Pessoa() is not applicable
      (actual and formal argument lists differ in length)
    constructor poo.javaii.Pessoa.Pessoa(java.lang.String,int,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
    constructor poo.javaii.Pessoa.Pessoa(java.lang.String,int,java.lang.String,float,float) is not applicable
      (actual and formal argument lists differ in length)
         */


        if (marcelinho.calcularImc() == -1) {
            System.out.println(marcelinho.toString() + " Abaixo do peso! ");
        } else if (marcelinho.calcularImc() == 0) {
            System.out.println(marcelinho.toString() + "Peso saudável! ");
        } else if (marcelinho.calcularImc() == 1) {
            System.out.println(marcelinho.toString() + " Sobrepeso! ");
        }

        if (marcelinho.ehMaiorIdade()) {
            System.out.println("É maior de idade!");
        } else {
            System.out.println("É menor de idade!");
        }
    }
}


