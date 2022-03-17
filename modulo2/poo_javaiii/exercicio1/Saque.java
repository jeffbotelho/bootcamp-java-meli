package poo.javaiii.exercicio1;

public interface Saque extends Transacoes {

    void sacar();

    @Override
    default void transacaoOk() {
        System.out.println("...");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("...");
    }
}


