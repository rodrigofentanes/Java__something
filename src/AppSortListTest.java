import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Movie;
import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Serie;
import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Title;

public class AppSortListTest {
  public static void main(String[] args) {
    ArrayList<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Adam Sandler");
    buscaPorArtista.add("Paulo");
    buscaPorArtista.add("Bruna Matos");
    buscaPorArtista.add("Jacqueline");
    buscaPorArtista.add("Ana Carolina");
  
    System.out.println("Init => " + buscaPorArtista);
    
    Collections.sort(buscaPorArtista);
    System.out.println("Sort => " + buscaPorArtista);

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
      2014, 
      4
    ));

    listSeries.add(new Serie(
      "The big bang theory", 
      true, 
      2008, 
      2
    ));

    listSeries.add(new Serie(
      "Sopranos", 
      true, 
      1991, 
      1
    ));
    
    ArrayList <Title> listGenerics = new ArrayList<>();
    listGenerics.addAll(listMovies);
    listGenerics.addAll(listSeries);

    System.out.println("===============================================");
    for (Title item : listGenerics) {
      System.out.println("Generic Item Init: " + item.getNome());
    }
    
    // Esta linha abaixo só é possível graças a implementação da classe "Comparable" que fizemos na classe "Title"
    // Juntamente com o overrinding do metodo compareTo()
    Collections.sort(listGenerics);
    
    System.out.println("===============================================");
    for (Title item : listGenerics) {
      System.out.println("Generic Item Sorted by Name: " + item.getNome());
    }
    
    // Também é possível fazer esta comparação sem implementar a classe "Comparable". Veja abaixo...
    listGenerics.sort(Comparator.comparing(Title::getAnoDeLancamento));
    
    for (Title item : listGenerics) {
      System.out.println("Generic Item Sorted By Year: " + item.getNome());
    }
  }
}
