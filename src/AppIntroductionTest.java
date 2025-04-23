import br.com.fentanes.nomeDoProjeto.Model.Movie;
import br.com.fentanes.nomeDoProjeto.Model.Serie;

public class AppIntroductionTest {
    // Digitar "psvm" é um atalho para criar uma método "public static void main(String[] args)"
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setNome("Top Gun");
        movie.setDuracaoEmMinutos(180);
        movie.setAnoDeLancamento(1985);
        movie.setAvaliacao(4.5);
        movie.setIncluidoNoPlano(true);
        movie.setTotalDeAvaliacoes(230);
        movie.exibeFixaTecnica();
        
        Movie movie0 = new Movie();
        movie0.exibeFixaTecnica();
        
        Movie movie1 = Movie.getInstance();
        movie1.setNome("Ta dando onda");
        movie1.setDuracaoEmMinutos(130);
        movie1.setAnoDeLancamento(2005);
        movie1.setAvaliacao(5.0);
        movie1.setIncluidoNoPlano(true);
        movie1.setTotalDeAvaliacoes(1000);
        movie1.exibeFixaTecnica();
        
        Movie movie2 = Movie.getInstance();
        movie2.exibeFixaTecnica();
        
        System.out.println("########################################################");
        
        // É importante ressaltar que só existe criação de objeto quando temos o "new",
        // fora este, estaremos atribuindo os valores por referência, 
        // no caso abaixo, tanto o "serie" quanto o "serie0" estarão apontando para o mesmo espaço de memória. 

        Serie serie = new Serie(
            "The big bang theory", 
            true, 
            1999, 
            2
        );

        Serie serie0 = serie;

        Serie serie1 = new Serie(
            "westworld", 
            true, 
            1999, 
            3
        );

        System.out.println("serie  => " + serie);
        System.out.println("serie0 => " + serie0);
        System.out.println("serie1 => " + serie1);

        System.out.println("########################################################");

        serie = new Serie(
            "The hundred", 
            true, 
            1999, 
            10
        );

        System.out.println("serie  => " + serie);
        System.out.println("serie0 => " + serie0);
        System.out.println("serie1 => " + serie1);
    }
}
