package br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
		System.out.println("Qual é seu nome ?");
		String nome = scan.next();
		System.out.println("\nBem vindo " + nome + "! Qual sua idade?");
        int idade = scan.nextInt();
		System.out.println("\nQuanto você gastou hoje?");
        double valor = scan.nextDouble();
		scan.close();

        // É possível imprimir o textos com os dados de acordo com a formatação:
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
    }
}
