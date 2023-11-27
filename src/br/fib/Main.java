package br.fib;

public class Main {
	public static void main(String[] args) {

		Persistencia dao = new AlunosSetPersistence();
		
		Aluno maria = new Aluno("Maria", "maria@gmail.com");
		Aluno joao = new Aluno("Joao", "joao@gmail.com");
		Aluno paulo = new Aluno("Paulo", "paulo@gmail.com");

		dao.create(paulo);
		dao.create(joao);
		dao.create(maria);
		
		System.out.println(dao.read("Maria"));
		
		maria.setEmail("maria@yahoo.com");
		dao.update(maria);
		
		System.out.println(dao);
		
		dao.delete(paulo);
		
		System.out.println(dao);
	}
}
