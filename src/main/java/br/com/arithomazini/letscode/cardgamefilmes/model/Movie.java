package br.com.arithomazini.letscode.cardgamefilmes.model;

import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;

import javax.persistence.*;

@Entity
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

    public Movie() {
    }

    public Movie(String id, String title, String movieYear, String genre, String plot, Double imdbRating) {
        this.id = id;
        this.title = title;
        this.movieYear = movieYear;
        this.genre = genre;
        this.plot = plot;
        this.imdbRating = imdbRating;
    }

    public Movie(String id, String title, String movieYear, String genre, String plot, String posterURL, Double imdbRating) {
        this.id = id;
        this.title = title;
        this.movieYear = movieYear;
        this.genre = genre;
        this.plot = plot;
        this.posterURL = posterURL;
        this.imdbRating = imdbRating;
    }

    public Movie (MovieDto dto) {
        this.id = dto.getId();
        this.imdbRating = dto.getImdbRating();
        this.plot = dto.getPlot();
        this.title = dto.getTitle();
        this.posterURL = dto.getPosterURL();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
