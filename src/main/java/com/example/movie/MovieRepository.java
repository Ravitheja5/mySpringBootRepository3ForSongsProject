package com.example.movie;
import java.util.*;

public interface MovieRepository{
    
    ArrayList<Movie> getAllMovies();

    Movie getMovie(int movieId);

    Movie postMovie(Movie movie);

    Movie updateMovie(int movieId,Movie movie);

    void deleteMovie(int movieId);
 

}