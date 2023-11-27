package br.fib;

public class Aluno implements Comparable<Aluno>{
	
	private int id;
	private String nome;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public Aluno(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.nome);
	}
	
	@Override
	public String toString() {
		return this.nome + " : " + this.email;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareTo(aluno.getNome());
	}
}
