package br.fib;

import java.util.*;

public class AlunosSetPersistence implements Persistencia{

    Set<Aluno> alunos = new HashSet<>();

    @Override
    public boolean create(Aluno aluno) {
        return alunos.add(aluno);
    }

    @Override
    public Aluno read(String nome) {
        List<Aluno> list = new ArrayList<>(this.alunos);
        int index = list.indexOf(new Aluno(nome));
        if(index > 0) {
            return list.get(index);
        }
        return null;
    }

    @Override
    public boolean update(Aluno aluno) {
        if(alunos.contains(aluno)){
            alunos.remove(aluno);
            alunos.add(aluno);
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
