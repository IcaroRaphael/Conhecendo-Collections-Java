package set.ordenacao.cadastro_produtos.comparator;

import set.ordenacao.cadastro_produtos.Produto;

import java.util.Comparator;

public class ProdutoPorNome implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}
