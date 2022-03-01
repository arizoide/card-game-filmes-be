package br.com.arithomazini.letscode.cardgamefilmes.controller;

import br.com.arithomazini.letscode.cardgamefilmes.dto.GameDto;
import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping
    public void voteValidate(@RequestBody GameDto gameDto, @RequestBody MovieDto choice) {
        gameService.voteValidate(gameDto, choice);
    }

    @GetMapping
    public GameDto getNewGame(@QueryParam("playerName") String playerName) {
        return gameService.getNewGame(playerName);
    }

}
