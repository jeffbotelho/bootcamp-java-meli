import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsportesDTO {

    private String nomeEsporte;

    public Esporte modalidade() {
        return new Esporte(this.nomeEsporte, null);
    }

    public EsportesDTO modalidade(Esporte esporte) {
        this.nomeEsporte = esporte.getNome();
        return this;
    }

    public static List<EsportesDTO> modalidade(List<Esporte> jogos) {
        return jogos.stream().map(j -> new EsportesDTO(j.getNome())).collect(Collectors.toList());

    }
}
