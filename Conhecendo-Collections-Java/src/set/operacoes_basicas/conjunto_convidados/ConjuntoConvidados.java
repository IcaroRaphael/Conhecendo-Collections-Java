package set.operacoes_basicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        verificaSet(convidados);
        Convidado removeConvidado = null;
        for(Convidado c : convidados){
            if(c.getCodigo() == codigoConvite){
                removeConvidado = c;
                break;
            }
        }
        convidados.remove(removeConvidado);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        verificaSet(convidados);
        for(Convidado c : convidados){
            System.out.println(c);
        }
    }

    public void verificaSet(Set<Convidado> lista){
        if(lista.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }
}
