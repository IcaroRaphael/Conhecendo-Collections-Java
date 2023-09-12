package map.ordenacao.livraria_online.comparator;

import map.ordenacao.livraria_online.Livro;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
