package com.postgresql.repository;

import com.postgresql.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
    Movie findMovieById(String movieId);
}
