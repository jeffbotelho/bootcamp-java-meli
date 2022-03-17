package poo.javaiii.exercicio1;

public interface Deposito  extends Transacoes {

    void depositar();

    @Override
    default void transacaoOk() {
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Depósito não realizado. Tente mais tarde!");
    }
}


