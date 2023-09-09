package list.pesquisa.catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        if(!livros.isEmpty()){
            List<Livro> resultadoPesquisa = new ArrayList<>();
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    resultadoPesquisa.add(l);
                }
            }
            if(resultadoPesquisa.isEmpty()){
                System.out.println("Resultado não encontrado!");
            }
            return resultadoPesquisa;
        }
        throw new RuntimeException("A lista está vazia!");
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if(!livros.isEmpty()){
            List<Livro> resultadoPesquisa = new ArrayList<>();
            for(Livro l : livros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    resultadoPesquisa.add(l);
                }
            }
            if(resultadoPesquisa.isEmpty()){
                System.out.println("Resultado não encontrado!");
            }
            return resultadoPesquisa;
        }
        throw new RuntimeException("A lista está vazia!");
    }

    public Livro pesquisarPorTitulo(String titulo){
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    return l;
                }
            }
            System.out.println("Resultado não encontrado!");
            return null;
        }
        throw new RuntimeException("A lista está vazia!");
    }
}
