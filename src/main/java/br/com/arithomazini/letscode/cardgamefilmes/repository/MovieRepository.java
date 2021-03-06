package br.com.arithomazini.letscode.cardgamefilmes.repository;

import br.com.arithomazini.letscode.cardgamefilmes.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {

    @Query("select m.id from Movie m")
    List<String> findAllIds();
}
