package poo.javaiii.exercicio1;

public class Basico implements Consulta, Saque, Pagamento {

    @Override
    public void consulta() {
        System.out.println("Consultar saldo");
    }

    @Override
    public void sacar() {
        System.out.println("Sacar valor em dinheiro!");
    }

    @Override
    public void pagarServico() {
        System.out.println("Realizando pagamento.");
    }

    @Override
    public void transacaoOk() {

    }

    @Override
    public void transacaoNaoOk() {

    }
}


