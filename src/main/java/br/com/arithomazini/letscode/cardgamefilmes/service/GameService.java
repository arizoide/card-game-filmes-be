package br.com.arithomazini.letscode.cardgamefilmes.service;

import br.com.arithomazini.letscode.cardgamefilmes.dto.GameDto;
import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.dto.RankingDto;
import br.com.arithomazini.letscode.cardgamefilmes.model.Game;
import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.model.Ranking;
import br.com.arithomazini.letscode.cardgamefilmes.repository.GameRepository;
import br.com.arithomazini.letscode.cardgamefilmes.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private MovieService movieService;

    @Autowired
    private GameHistoryService gameHistoryService;

    @Autowired
    private RankingService rankingService;

    @Autowired
    private GameRepository gameRepository;

    public void voteValidate(GameDto gameDto, MovieDto choice) {
        MovieDto bestRatedMovie = movieService.getBestRatedMovie(gameDto.getMovies().get(0), gameDto.getMovies().get(1));

        Game game = save(gameDto);

        gameHistoryService.save(game, choice);

        Ranking ranking = rankingService.findOrCreate(game.getPlayerName());

        if (choice.equals(bestRatedMovie)) {
            ranking.setErrors(ranking.getErrors() + 1);
        } else {
            ranking.setPoints(ranking.getPoints() + 1);
        }

        rankingService.save(ranking);
    }

    public GameDto getNewGame(String playerName) {
        return new GameDto(movieService.findAleatoryMovies(), playerName);
    }

    public Game save(GameDto dto) {
        return gameRepository.save(new Game(dto));
    }
}
