package poo.javaiii.exercicio3;

public class Gato extends Animal implements Carnivoro {

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    @Override
    public void comerCarne() {
        System.out.println("comendo peixe");
    }
}


