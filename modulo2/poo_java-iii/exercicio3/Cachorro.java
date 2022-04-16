package poo.javaiii.exercicio3;

public class Cachorro extends Animal implements Carnivoro {

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    @Override
    public void comerCarne() {
        System.out.println("comendo carne");
    }

//    @Override
//    public void comer() {
//        System.out.println("comer carne");
//    }
}


