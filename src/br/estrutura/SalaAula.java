package br.estrutura;

public class SalaAula {
	
	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[3];
		alunos[0] = new Aluno("Carlos");
		alunos[1] = new Aluno("Eduardo");
		alunos[2] = new Aluno("Ronaldo");
		
		Aluno[] alunos2 = {new Aluno("Carlos"),
				new Aluno("Carlos")
		};
		
		System.out.println(new Aluno("Ronaldo"));
	}
}