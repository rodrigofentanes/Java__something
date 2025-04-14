import java.util.ArrayList;

import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Movie;

public class AppCollectionsTest {
  public static void main(String[] args) {
    ArrayList <Movie> listMovies = new ArrayList<>();

    listMovies.add(new Movie(
      "Interstellar", 
      true, 
      2011, 
      298
    ));

    listMovies.add(new Movie(
      "Lion King", 
      true, 
      1995, 
      120
    ));

    listMovies.add(new Movie(
      "Fight Club", 
      true, 
      1999, 
      180
    ));

    for (Movie movie : listMovies) {
      System.out.println(movie.getNome());
    }

    System.err.println(listMovies.toString());
    System.err.println(listMovies.get(0).toString());
  }
}
