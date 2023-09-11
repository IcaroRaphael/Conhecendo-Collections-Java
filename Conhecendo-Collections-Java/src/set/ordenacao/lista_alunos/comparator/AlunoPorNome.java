package set.ordenacao.lista_alunos.comparator;

import set.ordenacao.lista_alunos.Aluno;

import java.util.Comparator;

public class AlunoPorNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}
