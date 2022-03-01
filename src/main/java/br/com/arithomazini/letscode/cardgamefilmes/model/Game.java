package br.com.arithomazini.letscode.cardgamefilmes.model;

import br.com.arithomazini.letscode.cardgamefilmes.dto.GameDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Movie firstMovie;

    @ManyToOne
    private Movie secondMovie;

    @Column
    private String playerName;

    public Game(GameDto gameDto) {
        this.firstMovie = new Movie(gameDto.getMovies().get(0));
        this.secondMovie = new Movie(gameDto.getMovies().get(1));
        this.playerName = gameDto.getPlayerName();
    }

}
