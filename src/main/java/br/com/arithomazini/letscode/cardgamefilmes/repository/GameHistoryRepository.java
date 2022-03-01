package br.com.arithomazini.letscode.cardgamefilmes.repository;

import br.com.arithomazini.letscode.cardgamefilmes.model.Game;
import br.com.arithomazini.letscode.cardgamefilmes.model.GameHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameHistoryRepository extends JpaRepository<GameHistory, Integer> {
}
