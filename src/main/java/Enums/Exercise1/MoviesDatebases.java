package Enums.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class MoviesDatebases {
    Map<String, Movie> movieName = new HashMap<>();

    public void addMovie(Movie m) {
        movieName.put(m.getMovieName(), m);
    }
    public void findMovie(Movie movieName){
                
    }


}

