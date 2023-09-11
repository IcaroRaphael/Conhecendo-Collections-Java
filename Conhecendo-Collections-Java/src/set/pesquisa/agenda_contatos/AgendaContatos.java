package set.pesquisa.agenda_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        verificaSet(contatos);
        for(Contato c : contatos){
            System.out.println(c);
        }
    }

    public Contato pesquisarPorNome(String nome){
        verificaSet(contatos);
        for(Contato c : contatos){
            if(c.getNome().startsWith(nome)){
                return c;
            }
        }
        return null;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        verificaSet(contatos);
        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                return c;
            }
        }
        return null;
    }

    public void verificaSet(Set<?> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista Vazia!");
        }
    }
}
