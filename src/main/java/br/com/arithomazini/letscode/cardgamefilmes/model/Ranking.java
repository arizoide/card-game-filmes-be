package br.com.arithomazini.letscode.cardgamefilmes.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ranking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String playerName;

    @Column
    private Integer points;

    @Column
    private Integer errors;

    public Ranking(String playerName, Integer points, Integer errors){
        this.playerName = playerName;
        this.points = points;
        this.errors = errors;
    }
}
