package dev.shobhit.movies.controller;

import dev.shobhit.movies.dto.Movie;
import dev.shobhit.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/api/v1/movies")
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> allMovie(){
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbid){
        return new ResponseEntity<>(movieService.getMovieByImdbId(imdbid), HttpStatus.OK);
    }
}
