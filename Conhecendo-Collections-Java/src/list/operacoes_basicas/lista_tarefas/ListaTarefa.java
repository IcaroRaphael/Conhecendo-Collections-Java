package list.operacoes_basicas.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        tarefas = new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!tarefas.isEmpty()){
            List<Tarefa> tarefasRemovidas = new ArrayList<>();
            for(Tarefa t : tarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasRemovidas.add(t);
                }
            }
            tarefas.removeAll(tarefasRemovidas);
        } else{
            System.out.println("Lista vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        if(!tarefas.isEmpty()){
            for(Tarefa t : tarefas){
                System.out.println(t.getDescricao());
            }
        } else{
            System.out.println("Lista vazia!");
        }
    }
}
