package map.operacoes_basicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        verificaMap(dicionario);
        if(dicionario.get(palavra) != null){
            dicionario.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada.");
        }
    }

    public void exibirPalavras(){
        verificaMap(dicionario);
        for(String chave : dicionario.keySet()){
            System.out.println(chave + ": " + dicionario.get(chave));
        }
    }

    public String pesquisarPorPalavra(String palavra){
        verificaMap(dicionario);
        if(dicionario.get(palavra) != null){
            return dicionario.get(palavra);
        }
        return "Palavra não encontrada.";
    }

    private void verificaMap(Map<?, ?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
