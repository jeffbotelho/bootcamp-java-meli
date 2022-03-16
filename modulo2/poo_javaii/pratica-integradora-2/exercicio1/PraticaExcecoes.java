package poo.javaii.pratica2.exercicio1;

public class PraticaExcecoes {
    int a = 0;
    int b = 300;
    double calculo = 0;

    public double calcular () {

        try {
            calculo = b / a;

        } catch (ArithmeticException e) {
//            System.out.println("Ocorreu um erro");
//            e.printStackTrace();
            throw new IllegalArgumentException("Não pode ser dividido por zero");

        } finally {
            System.out.println("Programa finalizado");
        }


        return calculo;
    }


    public static void main(String[] args) {

        PraticaExcecoes calculo = new PraticaExcecoes();

        System.out.println(calculo.calcular());
    }

}

