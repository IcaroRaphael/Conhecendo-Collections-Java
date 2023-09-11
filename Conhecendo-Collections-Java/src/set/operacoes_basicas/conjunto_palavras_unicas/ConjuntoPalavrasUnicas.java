package set.operacoes_basicas.conjunto_palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        verificaSet(palavras);
        for(String s : palavras){
            if(s.equalsIgnoreCase(palavra)){
                palavras.remove(s);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra){
        verificaSet(palavras);
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        verificaSet(palavras);
        for(String s : palavras){
            System.out.println(s);
        }
    }

    public void verificaSet(Set<?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
