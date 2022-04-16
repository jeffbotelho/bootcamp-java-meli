package poo.javaiii.exercicio1;

public interface Consulta extends Transacoes {

    void consulta();

    @Override
    default void transacaoOk() {
        System.out.println("Carregando!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Carregando!");
    }
}


