package br.com.fentanes.nomeDoProjeto.Model;

public class Title implements Comparable<Title> {
  private String nome;
	private int anoDeLancamento;
  private boolean incluidoNoPlano;
	private double avaliacao;
	private int totalDeAvaliacoes;

  public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getAnoDeLancamento() { return anoDeLancamento; }
	public void setAnoDeLancamento(int anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }
  
	public boolean isIncluidoNoPlano() { return incluidoNoPlano; }
	public void setIncluidoNoPlano(boolean incluidoNoPlano) { this.incluidoNoPlano = incluidoNoPlano; }

  public double getAvaliacao() { return avaliacao; }
	public void setAvaliacao(double avaliacao) { this.avaliacao = avaliacao; }
	
	public int getTotalDeAvaliacoes() { return totalDeAvaliacoes; }
	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) { this.totalDeAvaliacoes = totalDeAvaliacoes; }

  public Title() {}

  public Title(String nome, boolean incluidoNoPlano, int anoDeLancamento) {
    this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
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

	@Override
	public int compareTo(Title title) {
		return this.getNome().compareTo(title.getNome());
	}
}
