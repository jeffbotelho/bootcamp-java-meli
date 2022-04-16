package poo.javaiii.exercicio3;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    @Override
    public void comerPasto() {
        System.out.println("comendo pasto");
    }
}


