package br.com.arithomazini.letscode.cardgamefilmes.service;

import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MovieService {

    public static final String IMDB_PATTERN = "tt%07d";
    public static final int MOVIES_TO_SEARCH = 50;
    public static final int START_INCLUSIVE = 1;

    @Autowired
    private MovieRepository movieRepository;

    public MovieDto findIMDBMovie(String id){
        try {
            RestTemplate client = new RestTemplate();
            ResponseEntity<MovieDto> exchange = client.exchange("https://www.omdbapi.com/?apikey=78f8273b&i={id}",
                    HttpMethod.GET, null, MovieDto.class, id);

            return exchange.getBody();
        } catch (Exception e) {
            return new MovieDto(id);
        }
    }


    public void save(Movie movie){
        movieRepository.save(movie);
    }



    public void fillTestData() {
        IntStream.rangeClosed(START_INCLUSIVE, MOVIES_TO_SEARCH).boxed().collect(Collectors.toList()).forEach((s) -> save(new Movie(findIMDBMovie(String.format(IMDB_PATTERN, s)))));
    }
}
