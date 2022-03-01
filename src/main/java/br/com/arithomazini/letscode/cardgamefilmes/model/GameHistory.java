package br.com.arithomazini.letscode.cardgamefilmes.model;

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
public class  GameHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Game game;

    @ManyToOne
    private Movie choice;

    public GameHistory(Game game, Movie choice){
        this.game = game;
        this.choice = choice;
    }
}
