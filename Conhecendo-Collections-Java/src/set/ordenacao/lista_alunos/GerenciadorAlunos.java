package set.ordenacao.lista_alunos;

import set.ordenacao.lista_alunos.comparator.AlunoPorNome;
import set.ordenacao.lista_alunos.comparator.AlunoPorNota;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        verificaSet(alunos);
        Aluno removeAluno = null;
        for(Aluno a : alunos){
            if(a.getMatricula() == matricula){
                removeAluno = a;
                alunos.remove(removeAluno);
                break;
            }
        }
        if(removeAluno == null){
            System.out.println("Matricula não encontrada.");
        }
    }

    public void exibirAlunosPorNome(){
        verificaSet(alunos);
        Set<Aluno> alunosPorNome = new TreeSet<>(new AlunoPorNome());
        alunosPorNome.addAll(alunos);
        for(Aluno a : alunosPorNome){
            System.out.println(a);
        }
    }

    public void exibirAlunosPorNota(){
        verificaSet(alunos);
        Set<Aluno> alunosPorNota = new TreeSet<>(new AlunoPorNota());
        alunosPorNota.addAll(alunos);
        for(Aluno a : alunosPorNota){
            System.out.println(a);
        }
    }

    public void exibirAlunos(){
        verificaSet(alunos);
        for(Aluno a : alunos){
            System.out.println(a);
        }
    }

    private void verificaSet(Set<?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
