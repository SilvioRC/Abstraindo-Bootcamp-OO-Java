package poo;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "\n"
				+ "Título do Curso = " + getTitulo() + "Descrição = " + getDescricao() +"Nome do Professor(a) = " + getNomeProfessor() + "Carga Horaria = " + cargaHoraria + "h";
	}

    }
