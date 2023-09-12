package map.ordenacao.livraria_online;

import map.ordenacao.livraria_online.comparator.ComparatorPorAutor;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livraria;

    public LivrariaOnline() {
        livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livraria.put(link, livro);
    }

    public void removerLivro(String titulo){
        verificaMap(livraria);
        for(String chave : livraria.keySet()){
            if(livraria.get(chave).getTitulo().equalsIgnoreCase(titulo)){
                livraria.remove(chave);
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        verificaMap(livraria);
        Map<String, Livro> livrosPorPreco = new LinkedHashMap<>();
        //Estrutura de dados
        Map<String, Livro> copiaLivraria = new HashMap<>(livraria);
        while(copiaLivraria.size() > 0){
            Double menorPreco = Double.MAX_VALUE;
            String chaveMenorPreco = null;
            for(String k : copiaLivraria.keySet()){
                if(copiaLivraria.get(k).getPreco() < menorPreco){
                    menorPreco = copiaLivraria.get(k).getPreco();
                    chaveMenorPreco = k;
                }
            }
            livrosPorPreco.put(chaveMenorPreco, copiaLivraria.get(chaveMenorPreco));
            copiaLivraria.remove(chaveMenorPreco);
        }
        //Exibindo os livros
        for(Livro l : livrosPorPreco.values()){
            System.out.println(l);
        }
        System.out.println();
    }

    public void exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livraria.entrySet());
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        for(Livro l : livrosOrdenadosPorAutor.values()){
            System.out.println(l);
        }
        System.out.println();
    }

    public Set<Livro> pesquisarLivrosPorAutor(String autor){
        verificaMap(livraria);
        Set<Livro> livrosDoAutor = new HashSet<>();
        for(Livro l : livraria.values()){
            if(l.getTitulo().equalsIgnoreCase(autor)){
                livrosDoAutor.add(l);
            }
        }
        return livrosDoAutor;
    }

    public Livro obterLivroMaisCaro(){
        verificaMap(livraria);
        double maiorValor = Double.MIN_VALUE;
        Livro livroMaisCaro = null;
        for(Livro l : livraria.values()){
            if(l.getPreco() > maiorValor){
                maiorValor = l.getPreco();
                livroMaisCaro = l;
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        verificaMap(livraria);
        double menorValor = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        for(Livro l : livraria.values()){
            if(l.getPreco() < menorValor){
                menorValor = l.getPreco();
                livroMaisBarato = l;
            }
        }
        return livroMaisBarato;
    }

    public void exibirLivros(){
        verificaMap(livraria);
        for(Livro l : livraria.values()){
            System.out.println(l);
        }
        System.out.println();
    }
    private void verificaMap(Map<?, ?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
