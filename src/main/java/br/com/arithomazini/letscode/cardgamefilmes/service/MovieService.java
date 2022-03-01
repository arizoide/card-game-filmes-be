package br.com.arithomazini.letscode.cardgamefilmes.service;

import br.com.arithomazini.letscode.cardgamefilmes.client.OMDBClient;
import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MovieService {

    public static final String IMDB_PATTERN = "tt%07d";
    public static final int MOVIES_TO_SEARCH = 50;
    public static final int START_INCLUSIVE = 1;
    private static final Integer TWO = 2;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private OMDBClient omdbClient;

    public MovieDto findIMDBMovie(String id){
        try {
            return omdbClient.findIMDBMovie(id);
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

    public List<MovieDto> findAleatoryMovies() {
        List<String> ids = movieRepository.findAllIds();

        List<MovieDto> movies = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < TWO; i++) {
            int randomIndex = rand.nextInt(ids.size());
            String id = ids.get(randomIndex);
            ids.remove(randomIndex);
            movies.add(new MovieDto(movieRepository.findById(id).get()));
        }
        return movies;
    }

    public MovieDto getBestRatedMovie(MovieDto firstMovie, MovieDto secondMovie){
        return firstMovie.getImdbRating() > secondMovie.getImdbRating() ? firstMovie : secondMovie;
    }
}
