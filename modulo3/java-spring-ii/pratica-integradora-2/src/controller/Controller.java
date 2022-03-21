import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller {

    public static List<Pessoa> listaPessoas = new ArrayList<>();
    public static List<Esporte> listaEsportes = new ArrayList<>();

    static {
        listaPessoas.addAll(Arrays.asList(
                new Pessoa("Ichigo","Kurosaki", (short) 15),
                new Pessoa("Shinichi", "Izumi", (short) 16),
                new Pessoa("Midoriya", "Izuku", (short) 14),
                new Pessoa("Bon", "Clay", (short) 32),
                new Pessoa("Julius", "Novachrono", (short) 42)
        ));

        listaEsportes.addAll(Arrays.asList(
                new Esporte("Atletismo", "Avancado"),
                new Esporte("Basquete", "Avancado"),
                new Esporte("Boxe", "Avancado"),
                new Esporte("Futebol", "Avancado"),
                new Esporte("Natacao", "Avancado")
        ));
    }


    @GetMapping("/esportes")
    public List<EsportesDTO> esportes(@RequestParam String findSports) {
        return EsportesDTO.modalidade(listaEsportes.stream().collect(Collectors.toList()));
    }

    @GetMapping("/atletas")
    public List<EsportistasDTO> atletas(@RequestParam String findSportsPersons) {
        return EsportistasDTO.atleta(listaPessoas.stream().collect(Collectors.toList()));
    }
    
}
