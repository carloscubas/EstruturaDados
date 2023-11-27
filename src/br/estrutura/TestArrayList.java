package br.estrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria", "maria@gmail.com");
		Aluno joao = new Aluno("Joao", "joao@gmail.com");
		Aluno paulo = new Aluno("Paulo", "paulo@gmail.com");
		Aluno andernelson = new Aluno("Andernelson", "paulo@gmail.com");

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(maria);
		alunos.add(joao);
		alunos.add(paulo);
		alunos.add(andernelson);
		
		Collections.sort(alunos);
				
		for (Aluno nome : alunos) {
			System.out.println(nome);
		}
	}
}
