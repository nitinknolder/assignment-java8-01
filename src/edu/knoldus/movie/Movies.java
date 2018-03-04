package edu.knoldus.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Movies {

  String name;
  int releasedYear;
  float ratings;
  String genre;

  public Movies(String name, int releaseYear, int ratings, String genre) {
    this.name = name;
    this.releasedYear = releaseYear;
    this.ratings = ratings;
    this.genre = genre;
  }

  public String getNamesOfMovies() {
    return name;
  }

  public int getReleaseYear() {
    return releasedYear;
  }

  public float getMovieRatings() {
    return ratings;
  }

  public String getMoviegenre() {
    return genre;
  }
}
