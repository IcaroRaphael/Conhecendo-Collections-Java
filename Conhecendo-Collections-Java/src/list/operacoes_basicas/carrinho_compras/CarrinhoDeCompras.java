package list.operacoes_basicas.carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        if(!itens.isEmpty()){
            List<Item> itensRemovidos = new ArrayList<>();
            for(Item i : itens){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensRemovidos.add(i);
                }
            }
            itens.removeAll(itensRemovidos);
        } else{
            System.out.println("Lista vazia!");
        }
    }

    public double calcularValorTotal(){
        if(!itens.isEmpty()){
            double total = 0;
            for(Item i : itens){
                total += (i.getQuantidade() * i.getPreco());
            }
            return total;
        }
        return 0.0;
    }

    public void exibirItens(){
        if(!itens.isEmpty()){
            for(Item i : itens){
                System.out.println(i);
            }
        } else{
            System.out.println("Lista vazia!");
        }
    }
}
