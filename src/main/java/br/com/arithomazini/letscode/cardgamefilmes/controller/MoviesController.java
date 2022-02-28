package br.com.arithomazini.letscode.cardgamefilmes.controller;

import br.com.arithomazini.letscode.cardgamefilmes.dto.MovieDto;
import br.com.arithomazini.letscode.cardgamefilmes.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MovieService service;

    @GetMapping
    public String oi(){
        return "hbsuadhuas";
    }
}
