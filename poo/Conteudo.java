package poo;

public abstract class Conteudo {
	
	
	protected static final double XP_PADRAO = 5d;
	
	private String titulo;
	private String descricao;
	private String nomeProfessor;
	public abstract double  calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	
	
	

}
