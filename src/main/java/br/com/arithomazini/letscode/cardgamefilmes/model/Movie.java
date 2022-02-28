package br.com.arithomazini.letscode.cardgamefilmes.model;

import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private String id;

    @Column
    private String title;

    @Column
    private String movieYear;

    @Column
    private String genre;

    @Column
    private String plot;

    @Column
    private String posterURL;

    @Column
    private Double imdbRating;

    public Movie(String id, String title, String movieYear, String genre, String plot, Double imdbRating) {
        this.id = id;
        this.title = title;
        this.movieYear = movieYear;
        this.genre = genre;
        this.plot = plot;
        this.imdbRating = imdbRating;
    }

    public Movie (MovieDto dto) {
        this.id = dto.getId();
        this.imdbRating = dto.getImdbRating();
        this.plot = dto.getPlot();
        this.title = dto.getTitle();
        this.posterURL = dto.getPosterURL();
    }
}
