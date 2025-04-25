package com.pes.movies.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter

public class MovieEntity {

    private int movieId;
    private String movieName;
    private String movieHero;
    private String movieHeroine;
    private String language;
    private LocalDate releaseDate;

}
