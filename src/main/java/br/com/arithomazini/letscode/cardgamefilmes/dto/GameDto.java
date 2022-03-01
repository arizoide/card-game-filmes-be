package br.com.arithomazini.letscode.cardgamefilmes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDto {

    private List<MovieDto> movies;
    private String playerName;
}
