package dev.shobhit.movies.service;

import dev.shobhit.movies.dto.Movie;
import dev.shobhit.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String id){
        return movieRepository.findByImdbId(id);
    }
}
