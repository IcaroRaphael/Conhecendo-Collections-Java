package set.pesquisa.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        verificaSet(tarefas);
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefas.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas(){
        verificaSet(tarefas);
        for(Tarefa t : tarefas){
            System.out.println(t);
        }
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        verificaSet(tarefas);
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefas){
            if(t.isStatus()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        verificaSet(tarefas);
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefas){
            if(!t.isStatus()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        verificaSet(tarefas);
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        verificaSet(tarefas);
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefas.removeAll(tarefas);
    }

    public void verificaSet(Set<?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
