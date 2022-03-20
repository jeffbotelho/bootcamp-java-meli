import br.com.idade.excercicio.services.CalcularIdade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/{dia}/{mes}/{ano}")
    public long getDataNascimento(
            @PathVariable Integer dia,
            @PathVariable Integer mes,
            @PathVariable Integer ano) {

        Idade dataNascimento = new Idade(dia, mes, ano);
        CalcularIdade calcularIdade = new CalcularIdade();

        return calcularIdade.calcularIdade(dataNascimento);
    }
}
