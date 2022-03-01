package br.com.arithomazini.letscode.cardgamefilmes.repository;

import br.com.arithomazini.letscode.cardgamefilmes.model.Game;
import br.com.arithomazini.letscode.cardgamefilmes.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RankingRepository extends JpaRepository<Ranking, Integer> {
    Optional<Ranking> findByPlayerName(String playerName);
}
