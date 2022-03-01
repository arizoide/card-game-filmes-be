package br.com.arithomazini.letscode.cardgamefilmes.service;

import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.model.Game;
import br.com.arithomazini.letscode.cardgamefilmes.model.GameHistory;
import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.repository.GameHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameHistoryService {

    @Autowired
    private GameHistoryRepository gameHistoryRepository;

    public void save(Game game, MovieDto choice) {
        gameHistoryRepository.save(new GameHistory(game, new Movie(choice)));
    }
}
