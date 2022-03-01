package br.com.arithomazini.letscode.cardgamefilmes.dto;

import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.model.Ranking;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;


@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RankingDto {

    private Integer id;
    private String playerName;
    private Integer points;
    private Integer errors;


    public RankingDto(Ranking ranking){
        this.id = ranking.getId();
        this.playerName = ranking.getPlayerName();
        this.errors = ranking.getErrors();
        this.points = ranking.getPoints();
    }
}
