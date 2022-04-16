package poo.javaiii.exercicio1;

import java.math.BigDecimal;

public class Cobradores  implements Saque, Consulta {

    @Override
    public void consulta() {
        System.out.println("Realizar consulta!");
    }

    @Override
    public void sacar() {
        System.out.println("Realizar um saque!");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transacao realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Não foi possível completar a transacao. Tente novamente mais tarde!");
    }
}


