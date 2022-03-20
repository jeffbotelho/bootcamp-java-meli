import br.com.idade.excercicio.controller.Idade;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class CalcularIdade {

    public long calcularIdade(Idade idade) {

        LocalDate dataNascimento = LocalDate.of(idade.getAno(), idade.getMes(), idade.getDia());

        long idadeAtual = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
        return idadeAtual;
    }

}
