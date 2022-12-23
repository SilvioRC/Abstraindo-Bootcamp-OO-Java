package poo;



import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data ;
	
	
	@Override
	public double calcularXp() {

		return XP_PADRAO + 220d;
	}
	
	
	public Mentoria() {
		

	}
	

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "\n"+"Mentoria = " + getTitulo() + "Descrição = " + getDescricao() + "Nome do Professor da Mentoria = " + getNomeProfessor() + "Data = " + data + "";
	}
	


	
	
	
	
	

}
