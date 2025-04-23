package br.com.fentanes.nomeDoProjeto.Model;

public class Serie extends Title {
  private static final Serie instance = new Serie();
	public static Serie getInstance() { return instance; }

  private int numeroDeTemporadas;

  public int getNumeroDeTemporadas() { return numeroDeTemporadas; }
  public void setNumeroDeTemporadas(int numeroDeTemporadas) { this.numeroDeTemporadas = numeroDeTemporadas; }

  public Serie() {}

  public Serie(String nome, boolean incluidoNoPlano, int anoDeLancamento, int numeroDeTemporadas) {
    super(nome, incluidoNoPlano, anoDeLancamento);
    this.numeroDeTemporadas = numeroDeTemporadas;
  }

  @Override
  public void exibeFixaTecnica() {
		super.exibeFixaTecnica();
		System.out.printf(
			"""
				Ano do lancamento: %d
				========================================================
			""",
			getNumeroDeTemporadas()
		);
	}
}
