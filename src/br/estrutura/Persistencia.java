package br.estrutura;

public interface Persistencia {
	
	public boolean create(Aluno aluno);
	
	public Aluno read(String nome);
	
	public boolean update(Aluno aluno);
	
	public boolean delete(Aluno aluno);
	
}
