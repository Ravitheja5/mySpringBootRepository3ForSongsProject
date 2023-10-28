package com.example.movie;
  import org.springframework.web.bind.annotation.*;
  import java.util.*;
import com.example.movie.MovieService;
import com.example.movie.Movie;

@RestController
class MovieController{
  MovieService so=new MovieService();

  
  @GetMapping("/movies")
  public ArrayList<Movie> getMovies(){
    return so.getAllMovies();
  }

  @GetMapping("/movies/{movieId}")
  public Movie getMoviById(@PathVariable("movieId") int movieId){
     return so.getMovie(movieId);
  }

  @PostMapping("/movies")
  public Movie post(@RequestBody Movie movie){
    return so.postMovie(movie);
  }

  @PutMapping("/movies/{movieId}")
  public Movie update(@PathVariable("movieId") int movieId,@RequestBody Movie movie){
    return so.updateMovie(movieId,movie);
  }

  @DeleteMapping("/movies/{movieId}")
  public void delete(@PathVariable("movieId") int movieId){
      so.deleteMovie(movieId);
  }
 

}



 

