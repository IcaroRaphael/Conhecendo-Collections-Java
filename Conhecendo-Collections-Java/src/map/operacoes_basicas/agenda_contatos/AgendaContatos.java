package map.operacoes_basicas.agenda_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        verificaMap(contatos);
        contatos.remove(nome);
    }

    public void exibirContatos(){
        verificaMap(contatos);
        for(Map.Entry<String, Integer> contato : contatos.entrySet()){
            System.out.println(contato.getKey() + ": " + contato.getValue());
        }
    }

    public Integer pesquisarPorNome(String nome){
        verificaMap(contatos);
        return contatos.get(nome);
    }

    private void verificaMap(Map<?, ?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
