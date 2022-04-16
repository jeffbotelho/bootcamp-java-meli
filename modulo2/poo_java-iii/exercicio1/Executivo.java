package poo.javaiii.exercicio1;

public class Executivo implements Deposito, Transferencia {

    @Override
    public void depositar() {
        System.out.println("Fazendo um deposito!");
    }

    @Override
    public void tranferir() {
        System.out.println("Fazendo uma transfêrencia!");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Operacao realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Erro. Tente mais tarde!");
    }

}


