import java.util.ArrayList;

import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Movie;
import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Serie;
import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Title;

public class AppArrayListTest {
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

    ArrayList <Serie> listSeries = new ArrayList<>();

    listSeries.add(new Serie(
      "Westworld", 
      true, 
      1999, 
      4
    ));

    listSeries.add(new Serie(
      "The big bang theory", 
      true, 
      1999, 
      2
    ));

    listSeries.add(new Serie(
      "Sopranos", 
      true, 
      1999, 
      1
    ));

    System.out.println("===============================================");

    // Por ter a sobrescrita do método toString os dados aparecerão formatados
    for (Movie movie : listMovies) {
      System.out.println(movie.getNome());
    }

    System.err.println(listMovies.toString());
    System.err.println(listMovies.get(0).toString());

    System.out.println("===============================================");

    // Por NÃO ter a sobrescrita do método toString os dados aparecerão com o formato padrão
    for (Serie serie : listSeries) {
      System.out.println(serie.getNome());
    }

    System.err.println(listSeries.toString());
    System.err.println(listSeries.get(0).toString());

    System.out.println("===============================================");

    ArrayList <Title> listGenerics = new ArrayList<>();

    listGenerics.addAll(listMovies);
    listGenerics.addAll(listSeries);

    // A palavra-reservada "instanceOf" também é uma ótima opção para tratar dados dentro de uma lista genérica
    for (Title item : listGenerics) {
      System.out.println(item.getNome() + " => " + item.getClass() + "\n");
    }

    System.err.println(listGenerics.toString() + "\n");
    System.err.println(listGenerics.get(0).toString() + "\n");
    System.err.println(listGenerics.get(4).toString());

    System.out.println("===============================================");

    
  }
}
