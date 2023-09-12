package map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        verificaMap(agenda);
        Map<LocalDate, Evento> eventosEmOrdem = new TreeMap<>(agenda);
        for(LocalDate ld : eventosEmOrdem.keySet()){
            System.out.println(ld + ": " + agenda.get(ld));
        }
        System.out.println();
    }

    public void obterProximoEvento(){
        verificaMap(agenda);
        LocalDate atual = LocalDate.now();
        Map<LocalDate, Evento> eventosEmOrdem = new TreeMap<>(agenda);
        for(LocalDate ld : eventosEmOrdem.keySet()){
            if(ld.isEqual(atual) || ld.isAfter(atual)){
                System.out.println(ld + ": " + agenda.get(ld));
                break;
            }
        }
        System.out.println();
    }

    private void verificaMap(Map<?, ?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
