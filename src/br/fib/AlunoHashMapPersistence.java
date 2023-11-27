package br.fib;

import java.util.*;

public class AlunoHashMapPersistence implements Persistencia{

    Map<String, Aluno> alunos = new HashMap<String, Aluno>();

    @Override
    public boolean create(Aluno aluno) {
        this.alunos.put(aluno.getNome(), aluno);
        return true;
    }

    @Override
    public Aluno read(String nome) {
        return this.alunos.get(nome);
    }

    @Override
    public boolean update(Aluno aluno) {
        if(this.alunos.containsKey(aluno.getNome())){
            this.alunos.put(aluno.getNome(), aluno);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Aluno aluno) {
        return this.alunos.remove(aluno.getNome(), aluno);
    }

    @Override
    public String toString() {
            return Arrays.toString(this.alunos.values().toArray());
    }
}
