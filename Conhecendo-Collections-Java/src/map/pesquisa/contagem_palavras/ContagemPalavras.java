package map.pesquisa.contagem_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        verificaMap(palavras);
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        verificaMap(palavras);
        for(String palavra : palavras.keySet()){
            System.out.println(palavra + ": " + palavras.get(palavra));
        }
    }

    public String encontrarPalavrasMaisFrequente(){
        verificaMap(palavras);
        int maiorFrequencia = 0;
        String palavraMaisFrequente = null;
        for(String s : palavras.keySet()){
            if(palavras.get(s) > maiorFrequencia){
                maiorFrequencia = palavras.get(s);
                palavraMaisFrequente = s;
            }
        }
        return palavraMaisFrequente;
    }

    private void verificaMap(Map<?, ?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
