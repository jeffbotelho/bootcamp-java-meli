package poo.javaiii.exercicio1;

public interface Transferencia extends Transacoes {

    void tranferir();

    @Override
    default void transacaoOk() {
        System.out.println("Transferência realizada com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Não foi possível realizar a transferência. Tente mais tarde!");
    }
}

