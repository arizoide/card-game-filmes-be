package br.com.arithomazini.letscode.cardgamefilmes.repository;

import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
