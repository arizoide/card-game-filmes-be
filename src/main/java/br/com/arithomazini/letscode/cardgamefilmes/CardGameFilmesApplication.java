package br.com.arithomazini.letscode.cardgamefilmes;

import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CardGameFilmesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CardGameFilmesApplication.class, args);
		run.getBean(MovieService.class).fillTestData();
	}

}
