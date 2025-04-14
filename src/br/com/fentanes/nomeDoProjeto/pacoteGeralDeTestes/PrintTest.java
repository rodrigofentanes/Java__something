package br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes;

public class PrintTest {
    private static final String NOME = "Rafa";
    private static final int IDADE = 14;
    
    public static void main(String[] args) throws Exception {
        // A partir do Java 15 é possível utilizar o tex block e assim já imprimir uma string formatada, basta utilizar as aspas triplas, veja abaixo:
        System.out.println(
            """

            Eu pulo de linha no próprio código e o compilador...
            Já compreende!

                Até a identação e deste código é reconhecida!
            """
        );

        System.out.println(
            """
            Olá, %s!
            Sua idade é %d!
            """.formatted(NOME, IDADE)
        );
    }
}
