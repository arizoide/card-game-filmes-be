package br.com.arithomazini.letscode.cardgamefilmes.client;

import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieRepositoryTest {
    @Autowired
    private OMDBClient omdbClient;

    @Test
    void search() {
        MovieDto movie = this.omdbClient.findIMDBMovie("tt0000001");
        assert(movie.getTitle().equalsIgnoreCase("carmencita"));
    }
}
