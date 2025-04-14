package br.com.fentanes.nomeDoProjeto.pacoteGeralDeTestes;

public class Title {
  private String nome;
  private boolean incluidoNoPlano;
	private double avaliacao;
	private int totalDeAvaliacoes;

  public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
  
	public boolean isIncluidoNoPlano() { return incluidoNoPlano; }
	public void setIncluidoNoPlano(boolean incluidoNoPlano) { this.incluidoNoPlano = incluidoNoPlano; }

  public double getAvaliacao() { return avaliacao; }
	public void setAvaliacao(double avaliacao) { this.avaliacao = avaliacao; }
	
	public int getTotalDeAvaliacoes() { return totalDeAvaliacoes; }
	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) { this.totalDeAvaliacoes = totalDeAvaliacoes; }

  public Title() {}

  public Title(String nome, boolean incluidoNoPlano) {
    this.nome = nome;
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void exibeFixaTecnica() {
		System.out.printf(
			"""
				========================================================
				Nome: %s
				Incluido no plano: %b
				Avaliacao: %.2f
				Total de avaliacoes: %d
			""",
			getNome(),
			isIncluidoNoPlano(), 
			getAvaliacao(), 
			getTotalDeAvaliacoes()
		);
  }
}
