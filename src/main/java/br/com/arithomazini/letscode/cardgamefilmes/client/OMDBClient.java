package br.com.arithomazini.letscode.cardgamefilmes.client;

import br.com.arithomazini.letscode.cardgamefilmes.FeignConfig;
import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "omdb", url = "https://www.omdbapi.com?apikey=78f8273b", configuration = FeignConfig.class)
public interface OMDBClient {

    @GetMapping
    MovieDto findIMDBMovie(@RequestParam("i") String id);
}
