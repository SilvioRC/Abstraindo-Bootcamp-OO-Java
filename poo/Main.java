package poo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando um objeto
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java e Spring Boot" + "\n");
		curso1.setDescricao("Curso Básico ao Avançado em Java" + "\n");
		curso1.setNomeProfessor("Matheus" +" \n");
		curso1.setCargaHoraria(60);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de React" + "\n");
		curso2.setDescricao("Curso Básico ao Avançado em React" + "\n");
		curso2.setNomeProfessor("Carla" + "\n");
		curso2.setCargaHoraria(50);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria da Linguagem Java" + "\n");
		mentoria1.setDescricao("Resolução de Dúvidas e problemas" + "\n");
		mentoria1.setNomeProfessor("Juliana" + "\n");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Mentoria de React" + "\n");
		mentoria2.setDescricao("Resolução de Dúvidas e problemas" + "\n");
		mentoria2.setNomeProfessor("Alexandre" + "\n");
		mentoria2.setData(LocalDate.now());
		
		
		
		
		
		//DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
		//LocalDate = parsedDate = LocalDate.parse(text, formatters);
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);*/
		
		
		// Polimorfismo(instaciando conteudo a partir de Curso)
		//Conteudo conteudo =  new Curso();
		//Conteudo mentoria1 =  new Mentoria();
	
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp ao interessados na linguagem Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev devSilvio = new Dev();
		devSilvio.setNome("Silvio Rodrigues ");
		devSilvio.inscreverBootcamp(bootcamp);
		System.out.println("CONTEÚDOS INSCRITOS POR SILVIO" + "\n" + devSilvio.getConteudosInscritos());
		devSilvio.progredir(); // quanto mais colocar progredir mais aumentará o XP
		devSilvio.progredir();
		devSilvio.progredir();
		devSilvio.progredir();
		System.out.println("-");
		System.out.println("CONTEÚDOS INSCRITOS E AINDA DISPONÍVEIS PARA SILVIO" + "\n"  + devSilvio.getConteudosInscritos());
		System.out.println("______________________________________________________________________");
		System.out.println("CONTEÚDOS CONCLUÍDOS POR SILVIO" + "\n" + devSilvio.getConteudoConcluidos());
		System.out.println("XP = "+devSilvio.calcularTotalXp() + " pontos");
		
		System.out.println("===============================================================================================");
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas Souza");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("CONTEÚDOS INSCRITOS POR LUCAS" + "\n" + devLucas.getConteudosInscritos());
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("-");
		System.out.println("CONTEÚDOS INSCRITOS E AINDA DISPONÍVEIS PARA LUCAS" + "\n" + devLucas.getConteudosInscritos());
		System.out.println("_____________________________________________________________________");
		System.out.println("CONTEÚDOS CONCLUÍODS POR LUCAS" + "\n" + devLucas.getConteudoConcluidos());
		System.out.println("XP = "+devLucas.calcularTotalXp() + " pontos");
	


	}

}
