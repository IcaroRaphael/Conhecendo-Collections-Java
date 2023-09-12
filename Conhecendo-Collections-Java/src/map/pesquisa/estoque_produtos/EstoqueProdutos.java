package map.pesquisa.estoque_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        verificaMap(estoque);
        for(Long chave : estoque.keySet()){
            System.out.println(estoque.get(chave));
        }
    }

    public double calcularValorTotalEstoque(){
        verificaMap(estoque);
        double valorTotal = 0.0;
        for(Produto p : estoque.values()){
            valorTotal += p.getPreco() * p.getQuantidade();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        verificaMap(estoque);
        double valorMaisCaro = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        for(Produto p : estoque.values()){
            if(p.getPreco() > valorMaisCaro){
                valorMaisCaro = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        verificaMap(estoque);
        double valorMaisBarato = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        for(Produto p : estoque.values()){
            if(p.getPreco() < valorMaisBarato){
                valorMaisBarato = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        verificaMap(estoque);
        double maiorValorEstoque = Double.MIN_VALUE;
        Produto produtoMaisCaroEstoque = null;
        for(Produto p : estoque.values()){
            if((p.getPreco()*p.getQuantidade()) > maiorValorEstoque){
                maiorValorEstoque = p.getPreco()*p.getQuantidade();
                produtoMaisCaroEstoque = p;
            }
        }
        return produtoMaisCaroEstoque;
    }

    private void verificaMap(Map<?, ?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
