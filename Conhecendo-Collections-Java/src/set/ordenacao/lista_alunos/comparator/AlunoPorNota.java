package set.ordenacao.lista_alunos.comparator;

import set.ordenacao.lista_alunos.Aluno;

import java.util.Comparator;

public class AlunoPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
