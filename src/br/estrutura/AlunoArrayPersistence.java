package br.estrutura;

import java.util.Arrays;

public class AlunoArrayPersistence implements Persistencia{
	private Aluno[] alunos;
	private int contador = 0;
	
	public AlunoArrayPersistence(int tamanho) {
		this.alunos = new Aluno[tamanho];
	}

	@Override
	public boolean create(Aluno aluno) {
		if(contador < alunos.length) {
			alunos[contador] = aluno;
			alunos[contador].setId(contador);
			contador++;
			return true;
		} return false;
	}
	@Override
	public Aluno read(String nome) {
		for(int i=0; i < this.alunos.length; i++) {
			if(this.alunos[i] != null &&
					nome.equals(this.alunos[i].getNome())) {
				return alunos[i];
			}
		} return null;
	}

	@Override
	public boolean update(Aluno aluno) {
		Aluno alunoUpdate = this.read(aluno.getNome());
		if(alunoUpdate != null) {
			alunoUpdate.setEmail(aluno.getEmail());
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Aluno aluno) {
		Aluno alunoRemove = this.read(aluno.getNome());
		if(alunoRemove != null) {
			int index = alunoRemove.getId();
			for(int i=index; i < this.alunos.length-1; i++) {
				this.alunos[i] = this.alunos[i+1];
			}
			contador--;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
        return Arrays.toString(this.alunos);
	}
}
