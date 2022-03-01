package br.com.arithomazini.letscode.cardgamefilmes.service;

import br.com.arithomazini.letscode.cardgamefilmes.dto.RankingDto;
import br.com.arithomazini.letscode.cardgamefilmes.model.Ranking;
import br.com.arithomazini.letscode.cardgamefilmes.repository.GameRepository;
import br.com.arithomazini.letscode.cardgamefilmes.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingService {

    @Autowired
    private RankingRepository rankingRepository;

    public void save(Ranking ranking){
        rankingRepository.save(ranking);
    }

    public Ranking findOrCreate(String playerName) {
        return rankingRepository.findByPlayerName(playerName).
                orElseGet(() -> rankingRepository.save(new Ranking(playerName, 0, 0)));
    }
}
