package br.com.arithomazini.letscode.cardgamefilmes.dto;

import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;


@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private static final String NAO_INFORMADO = "Não Informado";

    @JsonProperty("imdbID")
    private String id;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Plot")
    private String plot;

    @JsonProperty("Poster")
    private String posterURL;

    private Double imdbRating;

    public MovieDto(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.plot = movie.getPlot();
        this.posterURL = movie.getPosterURL();
        this.imdbRating = movie.getImdbRating();
    }

    public MovieDto(String id) {
        this.id = id;
        this.imdbRating = 0.0;
        this.plot = NAO_INFORMADO;
        this.title = NAO_INFORMADO;
        this.posterURL = NAO_INFORMADO;
    }
    public static List<MovieDto> convert(List<Movie> movies) {
        return movies.stream().map(MovieDto::new).collect(Collectors.toList());
    }
}
