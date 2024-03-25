package com.postgresql.controller;


import com.postgresql.entity.Movie;
import com.postgresql.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;


    //POST - Add a movie
    @PostMapping( "/create")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }


    //GET - Get all movies & Get movie by ID
    @GetMapping("/")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable String movieId) {
        return movieRepository.findMovieById(movieId);
    }

    //PUT - Update a movie
    @PutMapping("/update/{movieId}")
    public Movie updateMovie(@PathVariable String movieId,@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    //DELETE - Delete a movie
    @DeleteMapping(value = "/delete/{movieId}")
    public void deleteMovie(@PathVariable String movieId) {
        movieRepository.deleteById(movieId);
    }
}
