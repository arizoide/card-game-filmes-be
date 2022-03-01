package br.com.arithomazini.letscode.cardgamefilmes.repository;

import br.com.arithomazini.letscode.cardgamefilmes.model.Game;
import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
