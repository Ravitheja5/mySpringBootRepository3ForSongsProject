package com.example.movie;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import com.example.movie.Movie;
import com.example.movie.MovieRepository;

import java.util.*;

// Do not modify the below code

public class MovieService implements MovieRepository {

  private static HashMap<Integer, Movie> movieList = new HashMap<>();

  public MovieService() {
    movieList.put(1, new Movie(1, "Avengers: Endgame", "Robert Downey Jr."));
    movieList.put(2, new Movie(2, "Avatar", "Sam Worthington"));
    movieList.put(3, new Movie(3, "Titanic", "Leonardo DiCaprio"));
    movieList.put(4, new Movie(4, "Star Wars: The Force Awakens", "Daisy Ridley"));
    movieList.put(5, new Movie(5, "Jurassic World", "Chris Pratt"));
  }

  // Do not modify the above code

  // Write your code here
  int unqId = 6;

  @Override
  public ArrayList<Movie> getAllMovies() {
    Collection<Movie> collection = movieList.values();
    ArrayList<Movie> arrList = new ArrayList<Movie>(collection);
    return arrList;
  }

  @Override
  public Movie getMovie(int movieId) {
    Movie movieObject = movieList.get(movieId);
    if (movieObject == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);

    }

    return movieObject;

  }

  @Override
  public Movie postMovie(Movie movie) {
    movie.setId(unqId);
    movieList.put(unqId, movie);
    unqId = unqId + 1;
    return movie;
  }

  @Override
  public Movie updateMovie(int movieId, Movie movie) {
    Movie movieObject = movieList.get(movieId);
    if (movieObject == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    if (movie.getMovieName() != null) {
      movieObject.setName(movie.getMovieName());
    }

    if (movie.getLeadActor() != null) {
      movieObject.setLeadActor(movie.getLeadActor());

    }

    return movieObject;

  }

  @Override
  public void deleteMovie(int movieId) {
    Movie movieObject = movieList.get(movieId);
    if (movieObject == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);

    } else {
      movieList.remove(movieId);
      throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }
  }

}

//https://github.com/Ravitheja5/mySpringBootRepository3ForSongsProject.git
