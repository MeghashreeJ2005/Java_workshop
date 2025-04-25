package com.pes.movies.service;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoimpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args){
        MovieEntity movieEntity = new MovieEntity();
       // movieEntity.setMovieId(1);
        movieEntity.setMovieName("Rajakumar");
        movieEntity.setMovieHero("Appu");
        movieEntity.setMovieHeroine("priya Anandh");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2014,3,17));

        movieEntity.setMovieName("Rajakumar");
        movieEntity.setMovieHero("Appu");
        movieEntity.setMovieHeroine("priya Anandh");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2014,3,17));


        MovieRepo repo=new MovieRepoimpl();
        repo.saveMovie(movieEntity);

    }
}
