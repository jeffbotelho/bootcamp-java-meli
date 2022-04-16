package poo.javaiii.exercicio1;

public interface Pagamento extends Transacoes {

    void pagarServico();

    @Override
    default void transacaoOk() {
        System.out.println("...");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("...");
    }
}


