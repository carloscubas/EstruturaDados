package br.fib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlunoArrayListPersistence implements Persistencia
{
	List<Aluno> alunos = new ArrayList<Aluno>();

	@Override
	public boolean create(Aluno aluno) {
		return alunos.add(aluno);
	}

	@Override
	public Aluno read(String nome) {
		int index = alunos.indexOf(new Aluno(nome));
		if(index > 0) {
			return alunos.get(index);
		}
		return null;
	}

	@Override
	public boolean update(Aluno aluno) {
		int index = alunos.indexOf(aluno);
		if(index > 0) {
			alunos.set(index, aluno);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Aluno aluno) {
		return alunos.remove(aluno);
	}
	
	@Override
	public String toString() {
        return Arrays.toString(this.alunos.toArray());
	}
}
