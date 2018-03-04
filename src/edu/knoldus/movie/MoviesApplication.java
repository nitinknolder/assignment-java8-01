package edu.knoldus.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesApplication {
  public static void main(String args[]) {

    List<Movies> listOfMovies = new ArrayList<>();
    listOfMovies.add(new Movies("Titanic", 1997, 9, "Romance"));
    listOfMovies.add(new Movies("Golmaal", 2006, 8, "Comedy"));
    listOfMovies.add(new Movies("Life", 2009, 6, "Sci-fi"));
    listOfMovies.add(new Movies("The Mr.Bean", 2009, 9, "Comedy"));
    listOfMovies.add(new Movies("All the Best", 2009, 6, "Comedy"));
    listOfMovies.add(new Movies("The Conjuring", 2013, 5, "Scary"));
    listOfMovies.add(new Movies("the Planet Earth", 2006, 7, "Sci-fi"));
    listOfMovies.add(new Movies("Kahaani", 2012, 7, "Suspense"));

    /* 1: List out all the movies with rating more than 8 and genre comedy.*/
    System.out.println("Movie with rating more than 8 and Genre is Comedy");
    listOfMovies.stream()
        .filter(search -> search.getMovieRatings() >= 8 && search.getMoviegenre()
            .equals("Comedy"))
        .map(searchMovie -> searchMovie.getNamesOfMovies()).forEach(System.out::println);

    /* 2: List out all the movies with release year greater than 2000 and rating less than 8.*/
    System.out.println("Movie With Rating less than 8 and rating is less than 8");
    listOfMovies.stream()
        .filter(search -> search.getReleaseYear() > 2000 && search.getMovieRatings() < 8)
        .map(searchMovie -> searchMovie.getNamesOfMovies()).forEach(System.out::println);

    /* 3: List out all the movies with rating as even number.*/
    System.out.println("Movies with  rating in even number");
    listOfMovies.stream()
        .filter(search -> search.getMovieRatings() % 2 == 0)
        .map(searchMovie -> searchMovie.getNamesOfMovies()).forEach(System.out::println);

    /* 4: List out all the movies with rating equals to 7 and genre Sci-Fi.*/
    System.out.println("Movies With rating equal to 7 and genre Sci- Fi ");
    listOfMovies.stream()
        .filter(search -> search.getMovieRatings() == 7 && search.getMoviegenre()
            .equals("Sci-fi"))
        .map(searchMovie -> searchMovie.getNamesOfMovies()).forEach(System.out::println);
  }
}
