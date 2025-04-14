package br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes;

public class Movie extends Title implements Classifiable {
	private static final Movie instance = new Movie();
	public static Movie getInstance() { return instance; }

	private int anoDeLancamento;
	private int duracaoEmMinutos;

	public int getAnoDeLancamento() { return anoDeLancamento; }
	public void setAnoDeLancamento(int anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }
	
	public int getDuracaoEmMinutos() { return duracaoEmMinutos; }
	public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }

	public Movie() {}

	public Movie(String nome, boolean incluidoNoPlano, int anoDeLancamento, int duracaoEmMinutos) {
		super(nome, incluidoNoPlano);
		this.anoDeLancamento = anoDeLancamento;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	@Override
	public void exibeFixaTecnica() {
		super.exibeFixaTecnica();
		System.out.printf(
			"""
				Ano do lancamento: %d
				Duracao em minutos: %d
				========================================================
			""",
			getAnoDeLancamento(), 
			getDuracaoEmMinutos()
		);
	}

	@Override
	public int getClassification() {
		return 0;
	}

	// Aqui ocorre uma sobrescrita de um método padrão do jáva, isso irá mudar inclusive a forma como o array é impresso no println().
	// Este é um recurso muito interessante para debugar código.
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() +")";
	}
}
