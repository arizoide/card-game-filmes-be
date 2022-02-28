package br.com.arithomazini.letscode.cardgamefilmes;

import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import br.com.arithomazini.letscode.cardgamefilmes.service.MovieService;
import feign.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class CardGameFilmesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CardGameFilmesApplication.class, args);
		run.getBean(MovieService.class).fillTestData();
	}
}
