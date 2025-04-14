import java.util.LinkedList;
import java.util.List;

import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Title;

public class AppListTest {
  public static void main(String[] args) {
    // Não podemos dar um new na classe "List" pois a mesma é uma interface, veja abaixo...
    // List<Title> listTitles = new List<Title>(); 
    // Devemos fazer da seguinte forma...
    List<Title> listTitles = new LinkedList<Title>(); 

  }
}
