import br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes.Movie;

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

    }
}
