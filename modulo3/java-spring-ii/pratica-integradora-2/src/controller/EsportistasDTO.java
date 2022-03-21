import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsportistasDTO {

    private String nome;
    private String sobrenome;

    public Pessoa atleta() {
        return new Pessoa(this.nome, this.sobrenome, (short) 0);
    }

  public EsportistasDTO atleta(Pessoa pessoa) {

        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
        return this;
  }

    public static List<EsportistasDTO> atleta(List<Pessoa> pessoas) {

        return pessoas.stream().map(p -> new EsportistasDTO(p.getNome(), p.getSobrenome())).collect(Collectors.toList());
    }

}
