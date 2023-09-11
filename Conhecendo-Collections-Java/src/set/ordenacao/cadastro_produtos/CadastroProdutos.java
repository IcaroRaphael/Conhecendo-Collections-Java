package set.ordenacao.cadastro_produtos;

import set.ordenacao.cadastro_produtos.comparator.ProdutoPorNome;
import set.ordenacao.cadastro_produtos.comparator.ProdutoPorPreco;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutos(){
        verificaSet(produtos);
        for(Produto p : produtos){
            System.out.println(p);
        }
    }

    public void exibirProdutosPorNome(){
        verificaSet(produtos);
        Set<Produto> produtosPorNome = new TreeSet<>(new ProdutoPorNome());
        produtosPorNome.addAll(produtos);
        for(Produto p : produtosPorNome){
            System.out.println(p);
        }
    }

    public void exibirProdutosPorPreco(){
        verificaSet(produtos);
        Set<Produto> produtosPorPreco = new TreeSet<>(new ProdutoPorPreco());
        produtosPorPreco.addAll(produtos);
        for(Produto p : produtosPorPreco){
            System.out.println(p);
        }
    }

    private void verificaSet(Set<?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
